sergioKeyValue
==============

keyValueRestAPIDB

API 

  Ottenere un jsonARRAY con la lista delle chiavi-valore
  curl -G http://localhost:8080/base/rest/keyvalues

  Aggiungere una singola chiave-valore
  curl -H "Content-Type: application/json" -d '{"key":"nome", "value":"giuseppe"}' http://localhost:8080/base/rest/keyvalue

  Aggiungere una lista di chiavi-valore
  curl -H "Content-Type: application/json" -d '[{"key":"nome", "value":"giuseppe"},{"key":"nome", "value":"simone"}]' http://localhost:8080/base/rest/keyvalues
