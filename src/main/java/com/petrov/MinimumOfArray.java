package com.petrov;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by pavelpetrov on 01.04.16.
 * 1. Создать maven проект из Intellij IDEA
 * 2. Добавить зависимость на JUnit
 * 3. Создать класс с методом int findMax(int[] array), который возвращает наибольшее значение массива и выкидывает
 * IllegalArgumentException, если с массивом что-то не в порядке.
 * 4. Создать тест на этот метод.
 * 5. Проверить, что всё работает через mvn clean install.
 * 6. Посмотреть другие аннотации JUnit (BeforeClass, AfterClass, expected exception etc).
 * <p>
 * 7. Почитать про системы контроля версий, Mercurial. Команды hg clone, hg status.
 * --
 * . Создать репозиторий на bitbucket.org
 * . Положить проект под версионную систему контроля и сделать пуш в удаленный репозиторий
 */
public class MinimumOfArray {

    public int findMax(int[] array) {
        if (array.equals(null))  {
            throw IllegalArgumentException
        }
        else if(array.length == 1 ){
            return array[0];
        }
        else{
            try {

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {
                        if (array[j] > array[j + 1]) {
                            int tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                        }
                    }
                }

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("array is not corected");

            }
            return array[0];
        }

    }
}



