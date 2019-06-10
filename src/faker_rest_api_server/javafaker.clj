(ns faker-rest-api-server.javafaker)


(def faker (new com.github.javafaker.Faker))

(->
 (.fullName)
 (.name)
 faker)

