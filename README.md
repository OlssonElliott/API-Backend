# API-Backend

## Instruktioner för att starta programmet:

Synka ett serverkonto med programmet, antingen skapa ett konto med samma inställningar som finns i application.properties eller så ändrar man innehållet i application.properties för att kunna nå servern.
Efter detta så starta först servern, när servern är startat så starta API-Backend. Efter detta starta tillslut API-Frontend.

API-Backend körs på localhost:8080 och API-Frontend körs på localhost:8081.
För att ändra frontend till något annat gå in i application.properties på API-frontend och ändra: server.port=8081 till vilken port du vill.
Sedan måste man uppdatera MealController så att @CrossOrigin stämmer överrens med rätt port.

### Kortfattat:

Synka servern.
Starta servern.
Starta API-Backend.
Starta API-Frontend.

## Överblick över programmet

Detta programmet är backend-delen av en receptapplikation, som använder sig av RESTful API för att hantera recept. Med hjälp av API:et från detta programmet kan frontend-applikationen hämta, lägga till, ta bort och uppdatera recept i en SQL-databas. Även lägga till favoritrecept och kommentar. Programmet använder sig av Spring Boot med dessa dependencies: Spring boot devtools, MySQL Driver, Spring Data JPA. Programmet använder sig av Java 21.

## Funktioner för programmet:

Visa alla recept: (GET-anrop) till databasen.

Hitta recept efter id: (GET-anrop) till databasen.

Lägg till ett recept: (POST-anrop) till databasen.

Ta bort ett recept: (DELETE-anrop) till databasen.

Toggla recept som favorit: (PUT-anrop) till databasen.

Lägg till kommentar: (PUT-anrop) till databasen.

## Förbättringar som finns kvar att göra:

- Istället för att använda @CrossOrigin hade det förmodligen vart bättre att göra en riktig klass som hanterar vilka som får anropa detta API.
  länk till @CrossOrigin som jag använde mig av för att klara uppgiften: https://spring.io/guides/gs/rest-service-cors
