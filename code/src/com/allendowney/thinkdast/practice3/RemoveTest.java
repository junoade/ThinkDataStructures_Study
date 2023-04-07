package com.allendowney.thinkdast.practice3;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveTest {
    protected List<Integer> mylist;
    protected List<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<>();
        mylist.addAll(list);
    }

    @Test
    public void testRemoveObject() {
        boolean flag = mylist.remove(new Integer(2));
        assertThat(flag, equalTo(true));
        assertThat(mylist.size(), is(2));
        assertThat(mylist.get(1), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = mylist.remove(new Integer(1));
        assertThat(flag, equalTo(true));
        assertThat(mylist.size(), is(1));
        assertThat(mylist.get(0), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = mylist.remove(new Integer(5));
        assertThat(flag, equalTo(false));
        assertThat(mylist.size(), is(1));
        assertThat(mylist.get(0), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = mylist.remove(new Integer(3));
        assertThat(flag, equalTo(true));
        assertThat(mylist.size(), is(0));
        //System.out.println(Arrays.toString(mal.toArray()));
    }


}
