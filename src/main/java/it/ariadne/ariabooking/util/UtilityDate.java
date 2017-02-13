package it.ariadne.ariabooking.util;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import it.ariadne.model.history.Delivery;
import it.ariadne.model.history.Reservation;

public class UtilityDate {

	public boolean checkAvailability(Reservation res, List<Reservation> listRes) {

		Interval intervalIn, intervalStored;
		Boolean overlap = false;

		intervalIn = new Interval(res.getStart(), res.getEnd());

		for (Reservation resStored : listRes) {

			intervalStored = new Interval(resStored.getStart(), resStored.getEnd());

			if (intervalIn.overlaps(intervalStored)) {

				if (resStored.getResource().getiD() == res.getResource().getiD()) {
					overlap = true;
				}

			}
		}
		return overlap;
	}

	public DateTime findFirstAvailability(Reservation res, List<Reservation> listRes) {
		
		Interval 	intervalIn, intervalStored;
		DateTime 	firstAvailability;
		DateTime 	start,end;
		
		intervalIn = new Interval(res.getStart(), res.getEnd());
		start = res.getStart();
		end	= res.getEnd();
				
				
		
		for (Reservation resStored : listRes) {
			
			if (resStored.getResource().getiD() == res.getResource().getiD()) {
				
				intervalStored = new Interval(resStored.getStart(),resStored.getEnd());
				
				while (intervalIn.overlaps(intervalStored)) {
					firstAvailability
				}
				
			}
				
				
			
		}
		
		
		
		return null;
	}

}
