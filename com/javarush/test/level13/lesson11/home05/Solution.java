package com.javarush.test.level13.lesson11.home05;

/**
 * JavaRush.ru
 * Level 13, Lesson 11, Home 05
 * <p/>
 * 1. Реализовать интерфейс  DBObject в классе  User.<b/>
 * 2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран
 * "User has name Neo, id = 1".<b/>
 * 3. Метод toString и метод main менять нельзя.<b/>
 * 4. Подумайте, что должен возвращать метод initializeIdAndName в классе User.
 * <p/>
 * Date: 29.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( Matrix.NEO );
    }

    static class Matrix
    {
        public static DBObject NEO = new User().initializeIdAndName( 1, "Neo" );
    }

    interface DBObject
    {
        DBObject initializeIdAndName( long id, String name );
    }

    static class User implements DBObject
    {
        long id;
        String name;

        public User initializeIdAndName( long id, String name )
        {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString()
        {
            return String.format( "User has name %s, id = %d", name, id );
        }
    }
}
