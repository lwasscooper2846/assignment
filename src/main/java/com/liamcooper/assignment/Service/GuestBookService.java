package com.liamcooper.assignment.Service;

import com.liamcooper.assignment.Domain.GuestBookEntry;
import com.liamcooper.assignment.Domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestBookService {
    @Autowired

    private GuestBookEntryRepository guestBookEntryRepository;
    public List <GuestBookEntry> findAllEntries () {
        return this.guestBookEntryRepository.findAll ();
    }
}
