# platzi-market
 

## Proyecto creado a partir del curso de Java de platzi

El proyecto se basa en una especie de tienda, la cual se pueden revisar
los productos, hacer compras y multiples peticiones de más


las principales urls son 

- platzi-market/api/products/
- platzi-market/api/purchases/

la ejecucion se realiza en PlatziMarketApplication

para ver la emulacion de la API se dejo habilitado el Swagger UI

http://localhost:8081/platzi-market/api/swagger-ui/index.html#/

Se crea la imagen en docker, se comprueba su construccion con:

- docker build -t platzi-market .
- docker-compose up --build -d


> Proyecto hecho 100% con amor al aprendizaje 😀