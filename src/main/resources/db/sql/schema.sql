-- Brand table definition
-- (ZARA, Pull&Bear, Massimo Dutti, Bershka, Stradivarius, Oysho, Zara Home, Lefties)
-- We don't use this table, but an external key was defined in the lab and I prefer to represent it
CREATE TABLE BRAND (
                        ID BIGINT PRIMARY KEY,
                        NAME VARCHAR(50) NOT NULL
);

-- Price table definition
-- I renamed PRICE_LIST to PRICE_ID, it is more representative
CREATE TABLE PRICE (
                        PRICE_ID BIGINT PRIMARY KEY,
                        BRAND_ID BIGINT NOT NULL,
                        START_DATE TIMESTAMP NOT NULL,
                        END_DATE TIMESTAMP NOT NULL,
                        PRODUCT_ID BIGINT NOT NULL,
                        PRIORITY INT NOT NULL,
                        PRICE DECIMAL(20, 2) NOT NULL, -- Importante para moneda
                        CURR VARCHAR(3) NOT NULL,
                        FOREIGN KEY (BRAND_ID) REFERENCES BRANDS(ID)
);