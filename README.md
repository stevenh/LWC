#LWC: Lightweight Chest+Furnace Protection and Management

Designed on top of hMod, It is fast and scalable. It does not use flat files, but instead <b>sqlite</b> -- a stateless, serverless SQL engine. In some cases it is actually <i>faster</i> than MySQL and other SQL engines.

Features
----------------------

* Private protections by Users and Groups or even by Password
* Public protections that anyone can use, but no one can register
* Protection limits--limit the amount of protections a User or Group can register
* Small memory footprint - LWC uses both physical and memory databases and entities are only loaded into memory when they are needed until done with them
* No excessive disk I/O. The disk is only written to when a new Chest is protected, a limit created or an access right created <span style="font-size: .75em;">(for private protections)</span>
* Built in support for double chests: proper recognition only requires you to register one side of a double chest. Internally, only one chest is registered, saving storage space
* much more. some features are largely undocumented!

Converting
----------------------

Are you using ChestProtect? LWC can seamlessly convert every chest from Chest Protect 100% to LWC. If you use a different chest plugin, open a GitHub issue, and it could possibly be created.
To convert a chest, do one of the following:
<b>In-game:</b> `/lwc convert chestprotect`
<b>Console:</b> `java -cp plugins/LWC.jar CPConverter`

Commands
----------------------
You can view the latest commands by typing `/lwc` ingame, and then typing a command to view more information on it