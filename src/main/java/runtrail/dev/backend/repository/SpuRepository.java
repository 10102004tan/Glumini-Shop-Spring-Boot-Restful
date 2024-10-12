package runtrail.dev.backend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import runtrail.dev.backend.dto.response.SpuDTO;
import runtrail.dev.backend.entity.SpuEntity;

@Repository
public interface SpuRepository extends JpaRepository<SpuEntity, Long> {
    List<SpuEntity> findBySpuName(String spuName);

    // find Spu filter and  contain price, thumb
    @Query("SELECT new runtrail.dev.backend.dto.response.SpuDTO(u.id,u.spuName,u.spuDescription,u.categoryId,u.brandId,min(sk.skuPrice),'images',u.spuStatus) FROM SpuEntity u inner join SkuEntity sk on sk.spu.id = u.id where sk.skuPrice >= :minPrice and sk.skuPrice <= :maxPrice and case when(:brandIds is not null) then (u.brandId in (:brandIds)) else (1 = 1) end  GROUP BY (u.id) ORDER BY case when ((:sortPrice) = 0 ) then (min(sk.skuPrice)) end asc, case when ((:sortPrice) = 1 ) then (min(sk.skuPrice)) end desc")
    Page<SpuDTO> findBySpuFilter(@Param("minPrice") long minPrice,@Param("maxPrice") long maxPrice,@Param("sortPrice") int sortPrice,@Param("brandIds") List<Long> brandIds,Pageable pageable);
}
