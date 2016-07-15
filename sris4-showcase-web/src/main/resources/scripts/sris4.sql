drop table client if exists;

CREATE TABLE client 
   (	"clientID" varchar2(255), 
		"clientName" VARCHAR2(255 ), 
		"clientBornIdentity" VARCHAR2(255 ),
		"clientBornLoc" VARCHAR2(255 ), 
		"clientBornOrder" VARCHAR2(255 ), 
		"clientBornDate" DATE,
		"clientAddress" VARCHAR2(255 ), 
		"clientMate" VARCHAR2(255 ),
		"clientFather" VARCHAR2(255 ),
		"clientMother" VARCHAR2(255 ),
		"clientNewId" VARCHAR2(255 ),
   ) ;