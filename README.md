# Example Plugin for Spigot Minecraft Server

An example plugin for the spigot Minecraft server that can be used as a template to write your own plugins.
Minecraft plugins are a great way to learn Java programming.

## Prerequisites

In order to try this out you need the following software to be installed on your machine:

* Java version 8 to 21 (e.g. [OracleJDK](https://www.oracle.com/java/technologies/downloads/#java21))
* [git](https://github.com/git-guides/install-git)
* [docker(Optional)](https://docs.docker.com/engine/install/)

## Quickstart

Clone the template project to your system:
````bash
git clone https://github.com/NicholasC2/spigot-plugin-template.git
````

This project uses [Maven](https://maven.apache.org/) for building. So on your command line run

````bash
mvn package
```` 

Once you have built the plugin you can copy it to a minecraft spigot server and test it. The jar file is in `target/mc-plugin-template-1.0.jar`.

In the log produced by the server watch out for the following lines indicating that the plugin was deployed properly:

```
...INFO]: [TemplatePlugin] Enabling TemplatePlugin v1.0
...INFO]: [TemplatePlugin] Plugin Enabled
``` 

Start the Mincraft client on your computer and connect to the local Mincraft server by specifying `localhost` or `127.0.0.1` as Server Address.

Open the command line in Minecraft (by pressing `/`) try the new command and see what happens:
```
/test
````

To play with the code e.g. open the plugin folder with vs code or a IDE of your choice.

Once you're done fiddling with the code don't forget to run `mvn package` and reloading the spigot server with `/reload confirm` for
your changes to take effect.

To install your plugin in another Minecraft server just copy the file `target/mc-plugin-template-1.0.jar` to
that server's `plugin` folder. 
