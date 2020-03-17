CREATE TABLE IF NOT EXISTS AM_API_CATEGORIES (
  UUID VARCHAR(50),
  NAME VARCHAR(255),
  DESCRIPTION VARCHAR(1024),
  TENANT_ID INTEGER DEFAULT -1,
  UNIQUE (NAME,TENANT_ID),
  PRIMARY KEY (UUID)
) ENGINE=InnoDB;

ALTER TABLE AM_SYSTEM_APPS
ADD TENANT_DOMAIN VARCHAR(255) DEFAULT 'carbon.super';

CREATE TABLE IF NOT EXISTS AM_USER (
    USER_ID VARCHAR(255) NOT NULL,
    USER_NAME VARCHAR(255) NOT NULL,
    PRIMARY KEY(USER_ID)
) ENGINE=InnoDB;
