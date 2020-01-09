package com.nisum.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SalesTerritories
{
    private static final Set<SalesTerritory> territories
        = new HashSet<>(
            Arrays.asList(
                new SalesTerritory[]{
                    new SalesTerritory( "North-East, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Maine", "New Hampshire", "Vermont",
                                                                                    "Rhode Island", "Massachusetts", "Connecticut",
                                                                                    "New York", "New Jersey", "Delaware", "Maryland",
                                                                                    "Eastern Pennsylvania", "District of Columbia" } ) ) ),
                    new SalesTerritory( "Appalachia, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "West-Virgina", "Kentucky",
                                                                                    "Western Pennsylvania" } ) ) ),
                    new SalesTerritory( "South-East, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Virginia", "North Carolina", "South Carolina",
                                                                                    "Georgia", "Florida", "Alabama", "Tennessee",
                                                                                    "Mississippi", "Arkansas", "Louisiana" } ) ) ),
                    new SalesTerritory( "Mid-West, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Ohio", "Michigan", "Wisconsin", "Minnesota",
                                                                                    "Iowa", "Missouri", "Illinois", "Indiana" } ) ) ),
                    new SalesTerritory( "Great Plains, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Oklahoma", "Kansas", "Nebraska",
                                                                                    "South Dakota", "North Dakota",
                                                                                    "Eastern Montana",
                                                                                    "Wyoming", "Colorada" } ) ) ),
                    new SalesTerritory( "Rocky Mountain, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Western Montana", "Idaho", "Utah", "Nevada" } ) ) ),
                    new SalesTerritory( "South-West, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Arizona", "New Mexico", "Texas" } ) ) ),
                    new SalesTerritory( "Pacific North-West, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "Washington", "Oregon", "Alaska" } ) ) ),
                    new SalesTerritory( "Pacific South-West, USA",
                                        new HashSet<>( Arrays.asList( new String[]{ "California", "Hawaii" } ) ) )
                }
            )
        );

    public static Set<SalesTerritory> getAllTerritories()
    {
        return Collections.unmodifiableSet( territories );
    }

    private SalesTerritories()
    {
    }

}
