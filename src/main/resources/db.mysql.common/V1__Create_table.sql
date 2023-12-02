create schema paros;

CREATE TABLE memo
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    created_at    datetime              NULL,
    updated_at    datetime              NULL,
    created_ip    VARCHAR(255)          NULL,
    is_background BIT(1)                NULL,
    size_type     VARCHAR(255)          NULL,
    title         VARCHAR(1000)         NULL,
    content       LONGTEXT              NULL,
    CONSTRAINT pk_memo PRIMARY KEY (id)
);

CREATE TABLE memo_tag
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime              NULL,
    updated_at datetime              NULL,
    tag        VARCHAR(255)          NULL,
    memo_id    BIGINT                NULL,
    CONSTRAINT pk_memo_tag PRIMARY KEY (id)
);

ALTER TABLE memo_tag
    ADD CONSTRAINT FK_MEMO_TAG_ON_MEMO FOREIGN KEY (memo_id) REFERENCES memo (id);