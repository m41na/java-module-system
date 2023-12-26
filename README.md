# Java's module systems (JMS)

**requires** takes a _module name_, for example espresso.presso.spi.main;  //module name

**uses** takes a _service type name_, for example, Drink; // type name

**provides** takes one or names of a _service type implementation_, for example, drink.works.hop.jms.milk.Juice  //implementations of a type

**exports** takes a _package name_, for example, works.hop.jms.spi; //package name

When _module-info.java_ is present, there is not need for _META-INF/services/<service-type-name>_ and vise versa

If both styles are put to use in a single module, then it becomes redundant and no additional benefits are realized by doing so.

The advantage of using _module-info.java_ over _META-INFO/services/<service-type-name>_ is that with modules, there is finer grained control 
over the component boundaries in terms of what is available to or reachable by the client

Regardless of whether one is using the _module-info.java_ style or _META-INF/services/<service-type-name>_ style, the concrete 
implementation of the **Service Type** should be present in the module path of the consuming module. This is most easily accomplished 
by importing the module project the particular build system in use


