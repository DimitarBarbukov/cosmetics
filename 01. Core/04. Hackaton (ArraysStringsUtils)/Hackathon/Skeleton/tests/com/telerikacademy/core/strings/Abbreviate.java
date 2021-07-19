package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Abbreviate {
    
    @Test
    @DisplayName("abbreviate() returns abbreviated string")
    public void abbreviate_abbreviates_input() {
        //Arrange
        var word = "Telerik Academy Alpha Java";
        var expected = "Telerik Academy...";
        
        //Act
        var result = StringHelpers.abbreviate(word, 15);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("abbreviate() returns unchanged string when given longer length")
    public void abbreviate_returns_unchanged_when_longerLength() {
        //Arrange
        var word = "Telerik Academy Alpha Java";
        var expected = "Telerik Academy Alpha Java";
        
        //Act
        var result = StringHelpers.abbreviate(word, 30);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("abbreviate() returns empty string when passed empty string")
    public void abbreviate_returns_empty_when_emptyString() {
        //Arrange
        var word = "";
        var expected = "";
        
        //Act
        var result = StringHelpers.abbreviate(word, 30);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
