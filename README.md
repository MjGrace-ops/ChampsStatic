# Compteur statique vs Compteur d'instances 🔢

Un petit projet Java illustrant la différence entre un attribut **statique** (« static ») et un attribut **d'instance » à travers une classe `Personne` qui compte ses propres instanciations.


## Comment ça marche ?

À chaque création d'un objet `Personne`, le constructeur incrémente les deux compteurs. `nbInstances` est partagé par tous les objets (statique), tandis que `nbLocal` appartient à chaque objet individuel (instance). Ceci met en évidence la principale différence entre les deux en Java.

## Structure du projet

```
├── Personne.java # Classe avec un compteur statique et un compteur d'instance
└── Main.java # Crée 4 objets et affiche les valeurs des deux compteurs
```

## Technologies utilisées

`Java` `POO` `Attributs statiques` `Constructeurs` `Attributs d'instance`

## Commencer

```bash
# Compiler les fichiers
javac *.java

# Lancer le programme
Java Principal
```

## Ce que le programme affiche

En créant 4 objets `Personne` et en affichant les compteurs du premier objet :

```
(1,4)
```

- `1` → `nbLocal` : vaut toujours `1` car chaque objet à sa propre copie
- `4` → `nbInstances` : vaut `4` car il est partagé entre tous les objets

## Personnalisation

`nbInstances`

Ajoutez un compteur statique `nbSuppressions` qui décrémente à chaque destruction d'objet pour suivre le cycle de vie complet.

'Personne'

Ajoutez des attributs comme `name` ou `age` pour enrichir la classe et la rendre plus réaliste.
