CREATE TABLE brand (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand_name VARCHAR(50) NOT NULL,
    brand_desc TEXT,
    brand_logo VARCHAR(255) NOT NULL
);
CREATE TABLE sku_attribute (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    category_id BIGINT,
    create_time DATE,
    update_date DATE
);
CREATE TABLE sku_attribute_value (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    attri_id BIGINT
);
CREATE TABLE sku (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    spu_id BIGINT,
    sku_name VARCHAR(100) NOT NULL,
    sku_description TEXT,
    sku_status INT,
    sku_stock BIGINT,
    sku_price BIGINT,
    sku_attri JSON
);
CREATE TABLE sku_images (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    sku_id BIGINT,
    image_url VARCHAR(255) NOT NULL,
    img_default INT,
    create_time DATE,
    update_time DATE
);
CREATE TABLE spu (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    spu_name VARCHAR(100) NOT NULL,
    spu_description TEXT,
    category_id BIGINT,
    brand_id BIGINT,
    spu_status INT
);
CREATE TABLE spu_images (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    spu_id BIGINT,
    name VARCHAR(50),
    img_url VARCHAR(255) NOT NULL,
    img_default INT,
    create_time DATE,
    update_time DATE
);
