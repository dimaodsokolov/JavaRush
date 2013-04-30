package com.javarush.test.level13.lesson02.task06;

/**
 * JavaRush.ru
 * Level 13, Lesson 02, Task 06
 * <p/>
 * 1. Подумать, что в программе неправильно.<b/>
 * 2. Вынести реализацию метода initializeIdAndName в класс User.<b/>
 * 3. initializeIdAndName в классе User должен возвращать тип User.<b/>
 * 4. Поправить программу, чтобы компилировалась и работала.
 * <p/>
 * Date: 28.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( Matrix.NEO );
        System.out.println( Matrix.TRINITY );
    }

    static class Matrix
    {
        public static DBObject NEO = new User().initializeIdAndName( 1, "Neo" );
        public static DBObject TRINITY = new User().initializeIdAndName( 2, "Trinity" );
    }

    interface DBObject
    {
        DBObject initializeIdAndName( long id, String name );
    }

    static class User implements DBObject
    {
        long id;
        String name;

        public DBObject initializeIdAndName( long id, String name )
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

// Исходный вариант:
//public class Solution
//{
//    public static void main( String[] args ) throws Exception
//    {
//        System.out.println( Matrix.NEO );
//        System.out.println( Matrix.TRINITY );
//    }
//
//    static class Matrix
//    {
//        public static DBObject NEO = new User().initializeIdAndName( 1, "Neo" );
//        public static DBObject TRINITY = new User().initializeIdAndName( 2, "Trinity" );
//    }
//
//    interface DBObject
//    {
//        DBObject initializeIdAndName( long id, String name )
//        {
//            this.id = id;
//            this.name = name;
//            return this;
//        }
//    }
//
//    static class User implements DBObject
//    {
//        long id;
//        String name;
//
//        @Override
//        public String toString()
//        {
//            return String.format( "User has name %s, id = %d", name, id );
//        }
//    }
//}