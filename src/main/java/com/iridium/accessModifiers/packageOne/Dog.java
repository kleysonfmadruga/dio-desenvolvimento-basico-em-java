package com.iridium.accessModifiers.packageOne;

public class Dog {
    // This attribute is 'public', this means that the name attribute can be accessed and modified by anyone
    // If this class is extended in the future, this attribute will be inherited
    public String name;

    // This attribute is 'private', this means that the age attribute only can be accessed internally by this class
    // If this class is extended in the future, this attribute won't be inherited
    // To access this kind of attribute, we must define an accessor method (aka 'getter') and a modificator method (aka 'setter')
    private Integer age;

    // This attrribute is 'protected', this means that the owner attribute only can be accessed inside this package
    // If this class is extended in the future, this attribute will be inherited
    protected String owner;

    // This is a getter for the 'age' attribute. It returns a value of the Integer type and not receive parameters
    public Integer getAge(){
        return this.age;
    }

    // This is a setter for the 'age' attribute. It not returns anything, but receive an age as a parameter
    public void setAge(Integer age){
        this.age = age;
    }
}
