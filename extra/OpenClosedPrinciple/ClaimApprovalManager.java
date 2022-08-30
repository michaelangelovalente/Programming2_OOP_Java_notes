public class ClaimApprovalManager{
    public void processClaim( InsuranceSurveyor insuranceSurveyor){
        if( insuranceSurveyor.isValidClaim()){
            System.out.println("Claim Approval Manager: Valid Claim.\nCurrently processing claim for approval...");
        }
    }
}