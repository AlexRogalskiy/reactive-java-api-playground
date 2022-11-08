# Introduction

The `reactive-java-api-bom` module is used to manage the version of third part dependencies. If you want to import
`reactive-java-api-xx` to your project, you need to import `reactive-java-api-bom` together by below way,
this can help you to manage the version.

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.tviplabs.api.playground</groupId>
            <artifactId>reactive-java-api-bom</artifactId>
            <version>${reactive-java-api.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

If you want to override the version defined in `reactive-java-api-bom` you can directly add the version at your
module's `dependencyManagement`.
