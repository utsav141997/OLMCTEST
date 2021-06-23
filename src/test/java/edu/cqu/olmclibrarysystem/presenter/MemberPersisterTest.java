/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cqu.olmclibrarysystem.presenter;

import edu.cqu.olmclibrarysystem.model.Member;
import edu.cqu.olmclibrarysystem.model.MemberBorrowedBook;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author apostol
 */
public class MemberPersisterTest {
    
    public MemberPersisterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addMember method, of class MemberPersister.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Member member = null;
        MemberPersister instance = new MemberPersister();
        instance.addMember(member);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllMembers method, of class MemberPersister.
     */
    @Test
    public void testFindAllMembers() {
        System.out.println("findAllMembers");
        MemberPersister instance = new MemberPersister();
        List<Member> expResult = null;
        List<Member> result = instance.findAllMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMemberBorrowedBook method, of class MemberPersister.
     */
    @Test
    public void testAddMemberBorrowedBook() {
        System.out.println("addMemberBorrowedBook");
        MemberBorrowedBook borrowedBook = null;
        MemberPersister instance = new MemberPersister();
        instance.addMemberBorrowedBook(borrowedBook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMemberBookByBookId method, of class MemberPersister.
     */
    @Test
    public void testDeleteMemberBookByBookId() {
        System.out.println("deleteMemberBookByBookId");
        int id = 0;
        MemberPersister instance = new MemberPersister();
        instance.deleteMemberBookByBookId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnMemberBorrowedBook method, of class MemberPersister.
     */
    @Test
    public void testReturnMemberBorrowedBook() {
        System.out.println("returnMemberBorrowedBook");
        MemberBorrowedBook borrowedBook = null;
        MemberPersister instance = new MemberPersister();
        instance.returnMemberBorrowedBook(borrowedBook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMemberByMemberId method, of class MemberPersister.
     */
    @Test
    public void testFindMemberByMemberId() {
        System.out.println("findMemberByMemberId");
        int id = 0;
        MemberPersister instance = new MemberPersister();
        Member expResult = null;
        Member result = instance.findMemberByMemberId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMemberBorrowedOverDueBooks method, of class MemberPersister.
     */
    @Test
    public void testGetAllMemberBorrowedOverDueBooks() {
        System.out.println("getAllMemberBorrowedOverDueBooks");
        MemberPersister instance = new MemberPersister();
        List<MemberBorrowedBook> expResult = null;
        List<MemberBorrowedBook> result = instance.getAllMemberBorrowedOverDueBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMemberBorrowedBooks method, of class MemberPersister.
     */
    @Test
    public void testGetAllMemberBorrowedBooks() {
        System.out.println("getAllMemberBorrowedBooks");
        MemberPersister instance = new MemberPersister();
        List<MemberBorrowedBook> expResult = null;
        List<MemberBorrowedBook> result = instance.getAllMemberBorrowedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMemberBorrowedBookByMemberId method, of class MemberPersister.
     */
    @Test
    public void testGetAllMemberBorrowedBookByMemberId() {
        System.out.println("getAllMemberBorrowedBookByMemberId");
        int id = 0;
        MemberPersister instance = new MemberPersister();
        List<MemberBorrowedBook> expResult = null;
        List<MemberBorrowedBook> result = instance.getAllMemberBorrowedBookByMemberId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllOverDueReturnsBorrowedBooks method, of class MemberPersister.
     */
    @Test
    public void testGetAllOverDueReturnsBorrowedBooks() {
        System.out.println("getAllOverDueReturnsBorrowedBooks");
        MemberPersister instance = new MemberPersister();
        List<MemberBorrowedBook> expResult = null;
        List<MemberBorrowedBook> result = instance.getAllOverDueReturnsBorrowedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
