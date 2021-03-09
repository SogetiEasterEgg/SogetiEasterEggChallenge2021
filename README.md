<span align="center">

![](src/images/Sogeti_Logo.svg)

</span>

---

<span align="center">

<h1 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Paasei <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h1>
<h6 style="color:#12ABDB">| Dutch version   |</h6>

#### Hoera, het is alweer bijna Pasen, tijd om naar paaseitjes te zoeken!
#### ‘Easter eggs’ zijn een bekend begrip binnen softwareland. De meeste klanten waarderen het niet als je easter eggs in hun productiecode zet, dus hier is je moment! Pak je Java verfpot en je toetsenbord en maak, letterlijk, het allertofste paasei. Gebruik ons template en versier het ei op de meest creatieve manier. Misschien kan je hem zelfs animeren als een flipbook? 
#### Doe mee met de wedstrijd en wij beoordelen op creativiteit in code en in uiterlijk van het ei. Er is een mooie prijs uit te loven.

</span>

--- 

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Regels <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

</span>

#### Het paasei leveren wij, de invulling is aan jou. Wel zijn er enkele regels om rekening mee te houden:
- Het is niet de bedoeling dat het paasei blokje in een println() wordt gemaakt, om deze vervolgens uit te printen. Daarom jureren we alleen paaseieren die genereerd worden op basis van code algoritme.
 Bijvoorbeeld wat niet is toegestaan:
 ```
 public void drawEgg() {
  println("   _   ");
  println(" _(\")_ ");
  println("(_ . _)");
  println(" / : \\ ");
  println("(_/ \\_)");
  }
  ```
- De code is geschreven in Java
- De code is te vinden op GitHub en Fork de repo van https://github.com/SogetiEasterEgg/SogetiEasterEggChallenge2021
- Deze Fork wordt vóór 29-03-2021 gedeeld met eastereggcompetition.nl@sogeti.com

---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Voorbeeldcode <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

#### De onderstaande code is een eenvoudig voorbeeld van hoe je de kleur kunt veranderen en het ei kunt ontwerpen
#### Vervang de "System.out.print (eggMetrics.getColor ());" in EasterEgg.java met de onderstaande code

</span>

````
if (isaLeftEyeBrow(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaRightEyeBrow(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaLeftEye(yCoordinate, xCoordinate)) {
    if (isaLeftEyePupil(yCoordinate, xCoordinate)) {
        System.out.print(Colors.PURPLE.getColor());
    } else {
        System.out.print(Colors.BLUE.getColor());
    }
}

else if (isaRightEye(yCoordinate, xCoordinate)) {
    if (isaRightEyePupil(yCoordinate, xCoordinate)) {
        System.out.print(Colors.PURPLE.getColor());
    } else {
        System.out.print(Colors.BLUE.getColor());
    }
   }

else if (isaNose(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaMouth(yCoordinate, xCoordinate)) {
    if (isaTongue(yCoordinate, xCoordinate)) {
        System.out.print(Colors.RED.getColor());
    } else {
        System.out.print(Colors.CYAN.getColor());
    }
}
else {
    System.out.print(Colors.WHITE.getColor());
}


private static boolean isaTongue(int yCoordinate, int xCoordinate) {
    return xCoordinate > 45 && xCoordinate < 59 && yCoordinate > 34 && yCoordinate < 38;
}

private static boolean isaMouth(int yCoordinate, int xCoordinate) {
    return xCoordinate > 42 && xCoordinate < 62 && yCoordinate > 30 && yCoordinate < 38;
}

private static boolean isaNose(int yCoordinate, int xCoordinate) {
    return xCoordinate > 50 && xCoordinate < 57 && yCoordinate > 25 && yCoordinate < 28;
}

private static boolean isaRightEyePupil(int yCoordinate, int xCoordinate) {
    return xCoordinate > 65 && xCoordinate < 72 && yCoordinate > 22 && yCoordinate < 27;
}

private static boolean isaRightEye(int yCoordinate, int xCoordinate) {
    return xCoordinate > 62 && xCoordinate < 72 && yCoordinate > 17 && yCoordinate < 27;
}

private static boolean isaLeftEyePupil(int yCoordinate, int xCoordinate) {
    return xCoordinate > 35 && xCoordinate < 42 && yCoordinate > 22 && yCoordinate < 27;
}

private static boolean isaLeftEye(int yCoordinate, int xCoordinate) {
    return xCoordinate > 32 && xCoordinate < 42 && yCoordinate > 17 && yCoordinate < 27;
}

private static boolean isaRightEyeBrow(int yCoordinate, int xCoordinate) {
    return xCoordinate > 60 && xCoordinate < 72 && yCoordinate > 14 && yCoordinate < 17;
}

private static boolean isaLeftEyeBrow(int yCoordinate, int xCoordinate) {
    return xCoordinate > 30 && xCoordinate < 42 && yCoordinate > 14 && yCoordinate < 17;
}

````

---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Probleem oplossen <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

</span>

#### Als je problemen hebt met het kiezen van je eigen ansi-kleur:
- In de Color.class zijn er twee links met documentatie en een korte uitleg hoe je je eigen kleur kiest.

---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Easter egg template <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

![](src/images/easter-egg-template.png)

</span>

---
<span align="center">

<h1 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Easter Egg <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h1>

<h6 style="color:#12ABDB">| English version   |</h6>

----

#### Hooray, it’s almost Easter again, time to look for Easter eggs!
#### Easter eggs are a well-known phenomenon in software. Most customers don’t appreciate it if you put some in production code, so here is your moment! Grab your Java paint bucket and your keyboard and create, literally, the most incredible easter egg. Use our starting template and decorate the egg in the most creative way. Maybe you can even make it animate like a flipbook?
#### Join the contest and we’ll judge on creativity in code and in appearance of the egg. There is a nice price involved.

</span>

---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Rules <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>



</span>

#### We deliver the Easter egg, the completion is up to you. There are some rules to keep in mind:
- It is not the intention that the Easter egg block is made in a println (), and then printed out. That is why we only judge Easter eggs that are generated based on code algorithm.
  For example, what is not allowed:

```
 public void drawEgg() {
  println("   _   ");
  println(" _(\")_ ");
  println("(_ . _)");
  println(" / : \\ ");
  println("(_/ \\_)");
  }
  ```
- The code is written in Java
- The code can be found at GitHub and Fork the repo from https://github.com/SogetiEasterEgg/SogetiEasterEggChallenge2021
- This fork is shared with eastereggcompetition.nl@sogeti.com before 29-03-2021

--- 

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Example Code <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

#### The code below is a simple example how to change the color and design the egg
#### Replace the " System.out.print(eggMetrics.getColor()); " in the EasterEgg.java with the code below

</span>

````
if (isaLeftEyeBrow(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaRightEyeBrow(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaLeftEye(yCoordinate, xCoordinate)) {
    if (isaLeftEyePupil(yCoordinate, xCoordinate)) {
        System.out.print(Colors.PURPLE.getColor());
    } else {
        System.out.print(Colors.BLUE.getColor());
    }
}

else if (isaRightEye(yCoordinate, xCoordinate)) {
    if (isaRightEyePupil(yCoordinate, xCoordinate)) {
        System.out.print(Colors.PURPLE.getColor());
    } else {
        System.out.print(Colors.BLUE.getColor());
    }
   }

else if (isaNose(yCoordinate, xCoordinate)) {
    System.out.print(Colors.BLACK.getColor());
}

else if (isaMouth(yCoordinate, xCoordinate)) {
    if (isaTongue(yCoordinate, xCoordinate)) {
        System.out.print(Colors.RED.getColor());
    } else {
        System.out.print(Colors.CYAN.getColor());
    }
}
else {
    System.out.print(Colors.WHITE.getColor());
}


private static boolean isaTongue(int yCoordinate, int xCoordinate) {
    return xCoordinate > 45 && xCoordinate < 59 && yCoordinate > 34 && yCoordinate < 38;
}

private static boolean isaMouth(int yCoordinate, int xCoordinate) {
    return xCoordinate > 42 && xCoordinate < 62 && yCoordinate > 30 && yCoordinate < 38;
}

private static boolean isaNose(int yCoordinate, int xCoordinate) {
    return xCoordinate > 50 && xCoordinate < 57 && yCoordinate > 25 && yCoordinate < 28;
}

private static boolean isaRightEyePupil(int yCoordinate, int xCoordinate) {
    return xCoordinate > 65 && xCoordinate < 72 && yCoordinate > 22 && yCoordinate < 27;
}

private static boolean isaRightEye(int yCoordinate, int xCoordinate) {
    return xCoordinate > 62 && xCoordinate < 72 && yCoordinate > 17 && yCoordinate < 27;
}

private static boolean isaLeftEyePupil(int yCoordinate, int xCoordinate) {
    return xCoordinate > 35 && xCoordinate < 42 && yCoordinate > 22 && yCoordinate < 27;
}

private static boolean isaLeftEye(int yCoordinate, int xCoordinate) {
    return xCoordinate > 32 && xCoordinate < 42 && yCoordinate > 17 && yCoordinate < 27;
}

private static boolean isaRightEyeBrow(int yCoordinate, int xCoordinate) {
    return xCoordinate > 60 && xCoordinate < 72 && yCoordinate > 14 && yCoordinate < 17;
}

private static boolean isaLeftEyeBrow(int yCoordinate, int xCoordinate) {
    return xCoordinate > 30 && xCoordinate < 42 && yCoordinate > 14 && yCoordinate < 17;
}

````

---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Troubleshooting <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

</span>

#### If you have trouble with choosing your own ansi color:
- In the Color.class there are two links with documentation and short explanation how to choose your own color.


---

<span align="center">

<h2 style="color:#12ABDB"> <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /> Easter egg template <img src="src/images/Duke-pasen.svg" alt="Duke-pasen" /></h2>

![](src/images/easter-egg-template.png)

</span>

---
