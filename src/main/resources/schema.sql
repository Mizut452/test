DROP TABLE IF EXISTS Member;

CREATE TABLE IF NOT EXISTS Member (
    memberId SERIAL PRIMARY KEY,
    memberName VARCHAR(255),
    memberLikeFood VARCHAR(255)
);