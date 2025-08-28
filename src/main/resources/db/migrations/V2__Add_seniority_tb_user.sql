-- V2: Migration to add seniority to the user table.
ALTER TABLE tb_user
ADD COLUMN SENIORITY_DB VARCHAR(255);