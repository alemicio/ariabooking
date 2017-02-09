package it.ariadne.ariabooking.util;

import java.util.List;

import org.joda.time.Interval;

import it.ariadne.model.history.Reservation;

public class UtilityDate {


	public boolean checkAvailability(Reservation res, List<Reservation> listRes) {
		
		Interval 	intervalIn, intervalStored;
		Boolean		overlap = false;
		
		intervalIn = new Interval(res.getStart(), res.getEnd());
		
		for (Reservation resStored : listRes) {
			
			intervalStored = new Interval(resStored.getStart(), resStored.getEnd());
			
			if(intervalIn.overlaps(intervalStored)){
				
				if (resStored.getResource().getiD() == res.getResource().getiD()) {
					overlap = true;
				}
				
				
			}
		}
		return overlap;	

	}


	
}
