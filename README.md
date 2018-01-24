# j2html-gwt
A GWT-compatible wrapper for [j2html.com](http://j2html.com) project.

## Getting started
### Add the maven dependency
```xml
<dependency>
    <groupId>com.j2html</groupId>
    <artifactId>j2html-gwt</artifactId>
    <version>0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

### Add inherits tag to your .gwt.xml
```xml
<module>
    <inherits name="j2html.J2Html"/>
</module>
```

### Limitations
You can not use tags that refer local file (InlineStaticResource) and JS/CSS minifiers as they are not GWT-compatible
