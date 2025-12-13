package Machine_Coding.ParkingLot.Controller;

import Machine_Coding.ParkingLot.Exception.InvalidTicketException;
import Machine_Coding.ParkingLot.Model.Bill;
import Machine_Coding.ParkingLot.Model.BillStatus;
import Machine_Coding.ParkingLot.Service.BillService;
import Machine_Coding.ParkingLot.dto.BillRequestDto;
import Machine_Coding.ParkingLot.dto.BillResponseDto;

public class BillController {
    BillService billService;
    public BillController(BillService billService){
        this.billService = billService;
    }

    public BillResponseDto generateBill(BillRequestDto billRequestDto){
        BillResponseDto response = new BillResponseDto();
        try{
            Bill bill = billService.generateBill(billRequestDto.getTicketId(),billRequestDto.getGateId());
            response.setBillStatus(BillStatus.SUCCESS);
            response.setExitTIme(bill.getExitTime());
            response.setGateId(bill.getGateId());
            response.setId(bill.getId());
            response.setPrice(bill.getPrice());
            response.setTicketId(bill.getTicketId());
            return response;
        }catch(InvalidTicketException e){
            System.out.println(e.getMessage());
            response.setBillStatus(BillStatus.FAILURE);
            return response;
        }
    }
}
