-- Dữ liệu cho bảng brand
INSERT INTO brand (brand_name, brand_desc, brand_logo) VALUES
('Nike', 'Leading brand in sportswear and shoes.', 'https://thumbs.dreamstime.com/b/web-183282273.jpg'),
('Adidas', 'Global sportswear manufacturer known for innovative products.', 'https://inkythuatso.com/uploads/thumbnails/800/2021/09/logo-adidas-vector-inkythuatso-01-29-09-08-58.jpg'),
('Apple', 'Technology brand known for its innovative products and sleek designs.', 'https://1000logos.net/wp-content/uploads/2016/10/Apple-Logo.jpg'),
('Sony', 'Pioneer in electronics and entertainment devices.', 'https://dwglogo.com/wp-content/uploads/2016/06/1800px_Sony_logo.png'),
('Samsung', 'Top brand in smartphones, appliances, and electronics.', 'https://rubee.com.vn/admin/webroot/upload/image//images/bai-viet/logo-samsung-4.jpg');

-- Dữ liệu cho bảng spu (Sản phẩm)
INSERT INTO spu (spu_name, spu_description, category_id, brand_id, spu_status) VALUES
('Nike Air Max 270', 'Lightweight sneakers with exceptional cushioning and support.', 1, 1, 1),
('Adidas Ultraboost 22', 'Running shoes designed for comfort and performance.', 1, 2, 1),
('Apple iPhone 14', 'Latest smartphone with advanced camera and performance.', 2, 3, 1),
('Sony WH-1000XM4', 'Noise-cancelling wireless headphones with superior sound quality.', 3, 4, 1),
('Samsung Galaxy S22', 'High-end smartphone with stunning display and powerful features.', 2, 5, 1);

-- Dữ liệu cho bảng spu_images (Ảnh sản phẩm)
INSERT INTO spu_images (spu_id, name, img_url, img_default, create_time, update_time) VALUES
(1, 'Nike Air Max 270 Front View', 'https://static.nike.com/a/images/t_PDP_936_v1/f_auto,q_auto:eco/1ef55791-81da-4075-89e9-327f01a726d8/W+AIR+MAX+270.png', 1, '2024-10-01', '2024-10-01'),
(1, 'Nike Air Max 270 Side View', 'https://static.nike.com/a/images/t_default/gorfwjchoasrrzr1fggt/AIR+MAX+270.png', 0, '2024-10-01', '2024-10-01'),
(2, 'Adidas Ultraboost 22 Front View', 'https://authentic-shoes.com/wp-content/uploads/2023/05/adidas-Ultra-Boost-22-Solar-Yell.png', 1, '2024-10-02', '2024-10-02'),
(2, 'Adidas Ultraboost 22 Side View', 'https://bizweb.dktcdn.net/100/339/085/products/thiet-ke-chua-co-ten-18-d62c7a60-d8cf-46ea-81b4-e254c2ad3f1f.png?v=1677396024703', 0, '2024-10-02', '2024-10-02'),
(3, 'Apple iPhone 14 Front View', 'https://yi-files.s3.eu-west-1.amazonaws.com/products/1555000/1555031/2499504-cover.jpg', 1, '2024-10-03', '2024-10-03'),
(3, 'Apple iPhone 14 Back View', 'https://i.pinimg.com/736x/81/08/d0/8108d02e64d5370f2575b51adc664592.jpg', 0, '2024-10-03', '2024-10-03'),
(4, 'Sony WH-1000XM4 Top View', 'https://logico.com.vn/images/products/2022/01/27/original/tai-nghe-khong-day-hi-res-chong-on-sony-wh-1000xm4-9_1643275098.png', 1, '2024-10-04', '2024-10-04'),
(4, 'Sony WH-1000XM4 Side View', 'https://www.sony.com.vn/image/a8a114c56c0e997c20a6d465e35d7103?fmt=png-alpha&wid=676&hei=400', 0, '2024-10-04', '2024-10-04'),
(5, 'Samsung Galaxy S22 Front View', 'https://www.talaco.net/samsung-s22-series/images/gallery-base-phantom-white/front.png', 1, '2024-10-05', '2024-10-05'),
(5, 'Samsung Galaxy S22 Back View', 'https://www.talaco.net/samsung-s22-series/images/gallery-plus-phantom-black/back.png', 0, '2024-10-05', '2024-10-05');

-- Dữ liệu cho bảng sku_attribute (Thuộc tính SKU)
INSERT INTO sku_attribute (name, category_id, create_time, update_date) VALUES
('Color', 1, '2024-09-01', '2024-09-02'),
('Size', 1, '2024-09-01', '2024-09-02'),
('Storage', 2, '2024-09-01', '2024-09-02'),
('RAM', 2, '2024-09-01', '2024-09-02');

-- Dữ liệu cho bảng sku_attribute_value (Giá trị thuộc tính SKU)
INSERT INTO sku_attribute_value (name, attri_id) VALUES
('Red', 1),
('Black', 1),
('White', 1),
('Small', 2),
('Medium', 2),
('Large', 2),
('64GB', 3),
('128GB', 3),
('8GB', 4),
('16GB', 4);

-- Dữ liệu cho bảng sku (SKU của sản phẩm)
INSERT INTO sku (spu_id, sku_name, sku_description, sku_status, sku_stock, sku_price, sku_attri) VALUES
(1, 'Nike Air Max 270 - Red, Medium', 'Red, Medium size variant of Nike Air Max 270', 1, 50, 15000, '{"Color":"Red","Size":"Medium"}'),
(1, 'Nike Air Max 270 - Black, Large', 'Black, Large size variant of Nike Air Max 270', 1, 75, 15500, '{"Color":"Black","Size":"Large"}'),
(2, 'Adidas Ultraboost 22 - White, Small', 'White, Small size variant of Adidas Ultraboost 22', 1, 60, 18000, '{"Color":"White","Size":"Small"}'),
(3, 'Apple iPhone 14 - 128GB, 8GB RAM', '128GB storage with 8GB RAM variant of iPhone 14', 1, 40, 99900, '{"Storage":"128GB","RAM":"8GB"}'),
(4, 'Sony WH-1000XM4 - Black', 'Black color variant of Sony WH-1000XM4', 1, 80, 30000, '{"Color":"Black"}'),
(5, 'Samsung Galaxy S22 - 64GB, 8GB RAM', '64GB storage with 8GB RAM variant of Galaxy S22', 1, 50, 85000, '{"Storage":"64GB","RAM":"8GB"}');

-- Dữ liệu cho bảng sku_images (Ảnh SKU)
INSERT INTO sku_images (sku_id, image_url, img_default, create_time, update_time) VALUES
(1, 'https://authentic-shoes.com/wp-content/uploads/2023/04/1__1__20e85019138540139a7813cac9c8ba71.png', 1, '2024-10-01', '2024-10-01'),
(1, 'https://authentic-shoes.com/wp-content/uploads/2023/04/498239_01.jpg_fd79f957bba2471183b57c62efa3d557.png', 0, '2024-10-01', '2024-10-01'),
(2, 'https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/0fa1bb41-d257-45c3-94d6-fa5211e70075/NIKE+AIR+MAX+270+GS.png', 1, '2024-10-01', '2024-10-01'),
(2, 'https://static.nike.com/a/images/t_PDP_936_v1/f_auto,q_auto:eco/a9a58e7a-4122-4ed1-8593-cb87c66d7a4a/NIKE+AIR+MAX+270+PS.png', 0, '2024-10-01', '2024-10-01'),
(3, 'https://bizweb.dktcdn.net/thumb/1024x1024/100/413/756/products/gz7211-01-1662862716184.png?v=1675313689077', 1, '2024-10-02', '2024-10-02'),
(3, 'https://authentic-shoes.com/wp-content/uploads/2023/04/gx8072.png_a1322a0cde5e43cab6c1ebd8afa108c9.png', 0, '2024-10-02', '2024-10-02'),
(4, 'https://cdn2.cellphones.com.vn/insecure/rs:fill:0:358/q:90/plain/https://cellphones.com.vn/media/catalog/product/p/h/photo_2022-09-28_21-58-51.jpg', 1, '2024-10-03', '2024-10-03'),
(4, 'https://cdn.viettelstore.vn/Images/Product/ProductImage/723473385.jpeg', 0, '2024-10-03', '2024-10-03'),
(5, 'https://cello.vn/image/cache/catalog/Cello/SanPham/Tai%20Nghe/Sony/WH-1000XM4/SonyWH1000XM4_Black_1-600x600.jpg', 1, '2024-10-04', '2024-10-04'),
(5, 'https://swiftronics.ca/cdn/shop/products/WH-1000XM46_1024x1024.png?v=1674066058', 0, '2024-10-04', '2024-10-04'),
(6, 'https://ntstore.com.vn/wp-content/uploads/2022/04/600_600_iphone_12_pro_gold_xtmobile.jpg', 1, '2024-10-05', '2024-10-05'),
(6, 'https://didongmoi.com.vn/upload/images/product/samsung/samsung-galaxy-s23-fe-gia-re-3.jpg', 0, '2024-10-05', '2024-10-05');
