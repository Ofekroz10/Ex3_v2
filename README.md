**<h1>Pacman game</h1>**
***
<img src="https://i.imgur.com/nHA5kss.png" alt="Untitled" border="0"/><br /><br/>
level 23.

**<h3>Introduction</h3>**
<hr>

This project is part of assignment in Ariel University.

Main purpose of the project is to:

<ul><li>Create user interface to GameServer , the game is to collect fruits with robots .</li>
<li>Create KML log in order to see the process of the game in google earth.</li></ul>

**<h3>How to use this project</h3>**
<hr>

This game is easy for use, just run the code in StartClass. you can find this class in package "gameClient"

```java
	public static void main(String[] args)
	{
		while(true)
		{
		String asrc = JOptionPane.showInputDialog("For authomatic game press a, else any key");
		boolean authomatic = (asrc.equals("a"));
		try {
		int level = Integer.valueOf(JOptionPane.showInputDialog("select level [0,23]"));
		Manual_client client =new Manual_client(level,authomatic);
		break;
		}
		catch (Exception ex) {
			
		}
	}
```
This is the code in StartClass, you can replace this code in this line

```java
Manual_client client =new Manual_client(level,authomatic); // level = [0,23], true for authomatic game, false for manual game
```


**<h3>How to play manual</h3>**


[![Click here to see the video](http://img.youtube.com/vi/v=HBQX07BRlMg/0.jpg)](http://www.youtube.com/watch?v=HBQX07BRlMg)



**<h3>How to see the data from the DB ?</h3>**
<hr>

When you complete a stage you will see authomaticly the results from the data base: <br>
<a href="https://ibb.co/HHg2mzy"><img src="https://i.ibb.co/HHg2mzy/result.png" alt="result" border="0"></a>

<h3>Examples</h3>
<hr>

**Fruit class**
```java
Fruit f = new Fruit(new Point3D(20,30,0),40,1,new Edge(2,10,4));
```

```java
Fruit f = new Fruit();
String json = "{"Fruit":{ "pos":"","value":"", "type":""}}";
f.initFromString(json);
```

**Robot**
```java
Robot r = new Robot();
String json = "{"Robot":{"pos":"","value":"","id":"","src":"","dest":"","speed":""}}";
r.initRobot(json);
```


