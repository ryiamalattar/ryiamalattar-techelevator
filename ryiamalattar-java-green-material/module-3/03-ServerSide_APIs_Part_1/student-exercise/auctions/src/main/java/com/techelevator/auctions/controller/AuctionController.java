package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    @RequestMapping ( path = "" ,method = RequestMethod.GET)
    public List<Auction> auctionList (@RequestParam (required = false) String title_like , @RequestParam (required = false) double currentBid_lte){
    	return dao.searchByTitleAndPrice(title_like, currentBid_lte);
    }
    
    @RequestMapping (path = "/{id}" , method= RequestMethod.GET)
    public Auction getAuctionById(@PathVariable int id) {
    	return dao.get(id);
    }
    
    @RequestMapping(method= RequestMethod.POST)
    public Auction createAuction(@RequestBody Auction auction) {
    	return dao.create(auction);
    }
    

    
}
