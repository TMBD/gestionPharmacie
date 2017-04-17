# gestionPharmacie
projet portant sur la gestion de pharmacie

-> Ce package concerne exclusivement la base de données.
-> Je l'ai crée pour separer les données de leur traitement (un peu comme l'architecture MVC)
-> Le fichier DataBaseConf.java comme son nom l'indique detient toutes les informations de configuration de notre base de données
et notre serveur (mot de passe, nom utilisateur...). Donc il est à adapter selon l'utilisateur.
-> Le fichier DataBaseCreator.java comme son nom le dit permet automatique des bases de données portant le nom des pharmacies et 
les instructions liées à la création des tables, les contraintes... sont definies dans le fichier dbFileCreator.sql
-> En fin le fichier TmbdRequests.java comporte des fonctions pour la manipulation des données (insertion, mise à jour...)
by TMBD
