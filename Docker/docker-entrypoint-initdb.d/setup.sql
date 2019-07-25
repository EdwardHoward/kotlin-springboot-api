\connect "posts";

CREATE SEQUENCE posts_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1;

CREATE TABLE "public"."posts" (
    "id" integer DEFAULT nextval('posts_id_seq') NOT NULL,
    "parent_id" integer,
    "author" character varying(30) DEFAULT 'Anonymous',
    "body" character varying(2000) NOT NULL,
    "created_at" timestamp DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT "posts_pkey" PRIMARY KEY ("id")
)

CREATE INDEX "idx_posts_parent" ON "public"."posts" USING btree ("parent_id");