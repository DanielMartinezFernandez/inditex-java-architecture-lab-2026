-- Insert values for BRAND (1 = ZARA)
-- Insert values for PRICES table

--BRAND_ID  START_DATE              END_DATE                PRICE_LIST  PRODUCT_ID  PRIORITY    PRICE   CURR
--1         2020-06-14-00.00.00     2020-12-31-23.59.59     1           35455       0           35.50   EUR
--1         2020-06-14-15.00.00     2020-06-14-18.30.00     2           35455       1           25.45   EUR
--1         2020-06-15-00.00.00     2020-06-15-11.00.00     3           35455       1           30.50   EUR
--1         2020-06-15-16.00.00     2020-12-31-23.59.59     4           35455       1           38.95   EUR
-- PRICE_LIST was renamed to PRICE_ID, and moved to the first element, it is the primary key of the table.
-- I prefer to move it to the first position.
INSERT INTO PRICES (PRICE_ID, BRAND_ID, START_DATE, END_DATE,  PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (1,1, '2020-06-14-00.00.00', '2020-12-31-23.59.59', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO PRICES (PRICE_ID, BRAND_ID, START_DATE, END_DATE, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (2,1, '2020-06-14 15:00:00', '2020-06-14 18:30:00',  35455, 1, 25.45, 'EUR');

INSERT INTO PRICES (PRICE_ID, BRAND_ID, START_DATE, END_DATE, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (3,1, '2020-06-15 00:00:00', '2020-06-15 11:00:00',  35455, 1, 30.50, 'EUR');

INSERT INTO PRICES (PRICE_ID, BRAND_ID, START_DATE, END_DATE, PRODUCT_ID, PRIORITY, PRICE, CURR)
VALUES (4,1, '2020-06-15 16:00:00', '2020-12-31 23:59:59',  35455, 1, 38.95, 'EUR');