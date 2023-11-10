
# EJB Client Web



## Les Etapes:
Apres avoir creer EJBServeur et apres la creation du Client il faut ajouter un nouveau projet web Dynamic Web Project Je l'ai nomme AnasWebClient il s'agit d'un projet web qu'on peut le lancer sur wildfly par la suite il faut que le projet web et le serveur on va le deployer dans le meme serveur d'application wildfly.
On a ajouter une autre interface Idalocal au contraire de l'autre qui est remote cette fois c'est Local aven l'anotation @Local et il on implementer cette interface dans notre serveur Attention pour deployer un projet Ejb avec le Web on doit le deployer dans un projet Ear (Entreprise Application Project) je l'ai appele ANEAR ce projet va contenir le serveur et le webclient.
Maintenant dans notre projet web on a besoin d'utiliser les interfaces de serveur on ajouter dans calsspath notre EjbProjet = Serveur par la suite dans notre projet web on a creer une autre page jsp index.jsp il contient une action avec button send on encore ajouter UserContoller dans un package controller on va trouver la servlet declarer dans notre web.xml.
A la fin il faut deployer le projet EAR mais avant il faut faire un clean au projet on click sur project apres clean (AnasWebClient) par la suite on va deployer notre ANEAR apres dans wildfly click sur deployement vous avez voir que le projet est bien deployer dont le quelle on a le serveur et le web.apres on accede a la page on clic sur send et a ce niveau il vient de faire l'insertion a la base de donne.
## Screen Exemple

![App Screenshot](https://github.com/Naciri-Anas/Scren/blob/main/Creation%20insertion%20commit.png?raw=true)

![App Screenshot](https://github.com/Naciri-Anas/Scren/blob/main/Screenshot%202023-11-10%20213144.png?raw=true)

![App Screenshot](https://github.com/Naciri-Anas/Scren/blob/main/Screenshot%202023-11-10%20213323.png?raw=true)


![App Screenshot](https://github.com/Naciri-Anas/Scren/blob/main/Screenshot%202023-11-10%20213355.png?raw=true)


![App Screenshot](https://github.com/Naciri-Anas/Scren/blob/main/Screenshot%202023-11-10%20213257.png?raw=true)


