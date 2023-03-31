> :warning: **This project is no longer maintained.**  
> For tools related to RODA, please look at https://market.roda-community.org

keeps-characterization-shp
===============================

Characterization tool of Shapefile files (shp)

## Build & Use

To build the application simply clone the project and execute the following Maven command: `mvn clean package`  
The binary will appear at `target/shp-characterization-tool-1.0-SNAPSHOT-jar-with-dependencies.jar`

To see the usage options execute the command:

```bash
$ java -jar target/shp-characterization-tool-1.0-SNAPSHOT-jar-with-dependencies.jar -h
usage: java -jar [jarFile]
 -f <arg> file to analyze
 -h       print this message
 -v       print this tool version
```

## Tool Output Example
```bash
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<shapefileCharacterizationResult>
    <identificationInfo>
        <version>1000</version>
    </identificationInfo>
    <validationInfo>
        <valid>true</valid>
    </validationInfo>
    <featuresInfo>
        <fileInfo>
            <boxMaxM>0.0</boxMaxM>
            <boxMaxX>-7.91015625</boxMaxX>
            <boxMaxY>41.37680856570233</boxMaxY>
            <boxMaxZ>0.0</boxMaxZ>
            <boxMinM>0.0</boxMinM>
            <boxMinX>-7.91015625</boxMinX>
            <boxMinY>41.37680856570233</boxMinY>
            <boxMinZ>0.0</boxMinZ>
            <fileCode>9994</fileCode>
            <fileLength>64</fileLength>
        </fileInfo>
        <recordStats>
            <counterMultiPatchShape>0</counterMultiPatchShape>
            <counterMultiPointMShape>0</counterMultiPointMShape>
            <counterMultiPointShape>0</counterMultiPointShape>
            <counterMultiPointZShape>0</counterMultiPointZShape>
            <counterNullShape>0</counterNullShape>
            <counterPointMShape>0</counterPointMShape>
            <counterPointShape>1</counterPointShape>
            <counterPointZShape>0</counterPointZShape>
            <counterPolyLineMShape>0</counterPolyLineMShape>
            <counterPolyLineZShape>0</counterPolyLineZShape>
            <counterPolygonMShape>0</counterPolygonMShape>
            <counterPolygonShape>0</counterPolygonShape>
            <counterPolygonZShape>0</counterPolygonZShape>
            <counterPolylineShape>0</counterPolylineShape>
            <total>1</total>
        </recordStats>
    </featuresInfo>
</shapefileCharacterizationResult>
```

## License

This software is available under the [LGPL version 3 license](LICENSE).

