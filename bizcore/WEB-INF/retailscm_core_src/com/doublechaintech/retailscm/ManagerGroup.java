package com.doublechaintech.retailscm;


import com.doublechaintech.retailscm.retailstorecountrycenter.RetailStoreCountryCenterManager;

import com.doublechaintech.retailscm.catalog.CatalogManager;

import com.doublechaintech.retailscm.levelonecategory.LevelOneCategoryManager;

import com.doublechaintech.retailscm.leveltwocategory.LevelTwoCategoryManager;

import com.doublechaintech.retailscm.levelthreecategory.LevelThreeCategoryManager;

import com.doublechaintech.retailscm.product.ProductManager;

import com.doublechaintech.retailscm.sku.SkuManager;

import com.doublechaintech.retailscm.retailstoreprovincecenter.RetailStoreProvinceCenterManager;

import com.doublechaintech.retailscm.provincecenterdepartment.ProvinceCenterDepartmentManager;

import com.doublechaintech.retailscm.provincecenteremployee.ProvinceCenterEmployeeManager;

import com.doublechaintech.retailscm.retailstorecityservicecenter.RetailStoreCityServiceCenterManager;

import com.doublechaintech.retailscm.citypartner.CityPartnerManager;

import com.doublechaintech.retailscm.potentialcustomer.PotentialCustomerManager;

import com.doublechaintech.retailscm.potentialcustomercontactperson.PotentialCustomerContactPersonManager;

import com.doublechaintech.retailscm.potentialcustomercontact.PotentialCustomerContactManager;

import com.doublechaintech.retailscm.cityevent.CityEventManager;

import com.doublechaintech.retailscm.eventattendance.EventAttendanceManager;

import com.doublechaintech.retailscm.retailstore.RetailStoreManager;

import com.doublechaintech.retailscm.retailstorecreation.RetailStoreCreationManager;

import com.doublechaintech.retailscm.retailstoreinvestmentinvitation.RetailStoreInvestmentInvitationManager;

import com.doublechaintech.retailscm.retailstorefranchising.RetailStoreFranchisingManager;

import com.doublechaintech.retailscm.retailstoredecoration.RetailStoreDecorationManager;

import com.doublechaintech.retailscm.retailstoreopening.RetailStoreOpeningManager;

import com.doublechaintech.retailscm.retailstoreclosing.RetailStoreClosingManager;

import com.doublechaintech.retailscm.retailstoremember.RetailStoreMemberManager;

import com.doublechaintech.retailscm.consumerorder.ConsumerOrderManager;

import com.doublechaintech.retailscm.consumerorderconfirmation.ConsumerOrderConfirmationManager;

import com.doublechaintech.retailscm.consumerorderapproval.ConsumerOrderApprovalManager;

import com.doublechaintech.retailscm.consumerorderprocessing.ConsumerOrderProcessingManager;

import com.doublechaintech.retailscm.consumerordershipment.ConsumerOrderShipmentManager;

import com.doublechaintech.retailscm.consumerorderdelivery.ConsumerOrderDeliveryManager;

import com.doublechaintech.retailscm.consumerorderlineitem.ConsumerOrderLineItemManager;

import com.doublechaintech.retailscm.consumerordershippinggroup.ConsumerOrderShippingGroupManager;

import com.doublechaintech.retailscm.consumerorderpaymentgroup.ConsumerOrderPaymentGroupManager;

import com.doublechaintech.retailscm.consumerorderpriceadjustment.ConsumerOrderPriceAdjustmentManager;

import com.doublechaintech.retailscm.retailstoremembercoupon.RetailStoreMemberCouponManager;

import com.doublechaintech.retailscm.memberwishlist.MemberWishlistManager;

import com.doublechaintech.retailscm.memberrewardpoint.MemberRewardPointManager;

import com.doublechaintech.retailscm.memberrewardpointredemption.MemberRewardPointRedemptionManager;

import com.doublechaintech.retailscm.memberwishlistproduct.MemberWishlistProductManager;

import com.doublechaintech.retailscm.retailstorememberaddress.RetailStoreMemberAddressManager;

import com.doublechaintech.retailscm.retailstoremembergiftcard.RetailStoreMemberGiftCardManager;

import com.doublechaintech.retailscm.retailstoremembergiftcardconsumerecord.RetailStoreMemberGiftCardConsumeRecordManager;

import com.doublechaintech.retailscm.goodssupplier.GoodsSupplierManager;

import com.doublechaintech.retailscm.supplierproduct.SupplierProductManager;

import com.doublechaintech.retailscm.productsupplyduration.ProductSupplyDurationManager;

import com.doublechaintech.retailscm.supplyorder.SupplyOrderManager;

import com.doublechaintech.retailscm.supplyorderconfirmation.SupplyOrderConfirmationManager;

import com.doublechaintech.retailscm.supplyorderapproval.SupplyOrderApprovalManager;

import com.doublechaintech.retailscm.supplyorderprocessing.SupplyOrderProcessingManager;

import com.doublechaintech.retailscm.supplyorderpicking.SupplyOrderPickingManager;

import com.doublechaintech.retailscm.supplyordershipment.SupplyOrderShipmentManager;

import com.doublechaintech.retailscm.supplyorderdelivery.SupplyOrderDeliveryManager;

import com.doublechaintech.retailscm.supplyorderlineitem.SupplyOrderLineItemManager;

import com.doublechaintech.retailscm.supplyordershippinggroup.SupplyOrderShippingGroupManager;

import com.doublechaintech.retailscm.supplyorderpaymentgroup.SupplyOrderPaymentGroupManager;

import com.doublechaintech.retailscm.retailstoreorder.RetailStoreOrderManager;

import com.doublechaintech.retailscm.retailstoreorderconfirmation.RetailStoreOrderConfirmationManager;

import com.doublechaintech.retailscm.retailstoreorderapproval.RetailStoreOrderApprovalManager;

import com.doublechaintech.retailscm.retailstoreorderprocessing.RetailStoreOrderProcessingManager;

import com.doublechaintech.retailscm.retailstoreorderpicking.RetailStoreOrderPickingManager;

import com.doublechaintech.retailscm.retailstoreordershipment.RetailStoreOrderShipmentManager;

import com.doublechaintech.retailscm.retailstoreorderdelivery.RetailStoreOrderDeliveryManager;

import com.doublechaintech.retailscm.retailstoreorderlineitem.RetailStoreOrderLineItemManager;

import com.doublechaintech.retailscm.retailstoreordershippinggroup.RetailStoreOrderShippingGroupManager;

import com.doublechaintech.retailscm.retailstoreorderpaymentgroup.RetailStoreOrderPaymentGroupManager;

import com.doublechaintech.retailscm.warehouse.WarehouseManager;

import com.doublechaintech.retailscm.storagespace.StorageSpaceManager;

import com.doublechaintech.retailscm.smartpallet.SmartPalletManager;

import com.doublechaintech.retailscm.goodsshelf.GoodsShelfManager;

import com.doublechaintech.retailscm.goodsshelfstockcount.GoodsShelfStockCountManager;

import com.doublechaintech.retailscm.stockcountissuetrack.StockCountIssueTrackManager;

import com.doublechaintech.retailscm.goodsallocation.GoodsAllocationManager;

import com.doublechaintech.retailscm.goods.GoodsManager;

import com.doublechaintech.retailscm.goodspackaging.GoodsPackagingManager;

import com.doublechaintech.retailscm.goodsmovement.GoodsMovementManager;

import com.doublechaintech.retailscm.supplierspace.SupplierSpaceManager;

import com.doublechaintech.retailscm.receivingspace.ReceivingSpaceManager;

import com.doublechaintech.retailscm.shippingspace.ShippingSpaceManager;

import com.doublechaintech.retailscm.damagespace.DamageSpaceManager;

import com.doublechaintech.retailscm.warehouseasset.WarehouseAssetManager;

import com.doublechaintech.retailscm.transportfleet.TransportFleetManager;

import com.doublechaintech.retailscm.transporttruck.TransportTruckManager;

import com.doublechaintech.retailscm.truckdriver.TruckDriverManager;

import com.doublechaintech.retailscm.transporttask.TransportTaskManager;

import com.doublechaintech.retailscm.transporttasktrack.TransportTaskTrackManager;

import com.doublechaintech.retailscm.accountset.AccountSetManager;

import com.doublechaintech.retailscm.accountingsubject.AccountingSubjectManager;

import com.doublechaintech.retailscm.accountingperiod.AccountingPeriodManager;

import com.doublechaintech.retailscm.accountingdocumenttype.AccountingDocumentTypeManager;

import com.doublechaintech.retailscm.accountingdocument.AccountingDocumentManager;

import com.doublechaintech.retailscm.accountingdocumentcreation.AccountingDocumentCreationManager;

import com.doublechaintech.retailscm.accountingdocumentconfirmation.AccountingDocumentConfirmationManager;

import com.doublechaintech.retailscm.accountingdocumentauditing.AccountingDocumentAuditingManager;

import com.doublechaintech.retailscm.accountingdocumentposting.AccountingDocumentPostingManager;

import com.doublechaintech.retailscm.originalvoucher.OriginalVoucherManager;

import com.doublechaintech.retailscm.originalvouchercreation.OriginalVoucherCreationManager;

import com.doublechaintech.retailscm.originalvoucherconfirmation.OriginalVoucherConfirmationManager;

import com.doublechaintech.retailscm.originalvoucherauditing.OriginalVoucherAuditingManager;

import com.doublechaintech.retailscm.accountingdocumentline.AccountingDocumentLineManager;

import com.doublechaintech.retailscm.levelonedepartment.LevelOneDepartmentManager;

import com.doublechaintech.retailscm.leveltwodepartment.LevelTwoDepartmentManager;

import com.doublechaintech.retailscm.levelthreedepartment.LevelThreeDepartmentManager;

import com.doublechaintech.retailscm.skilltype.SkillTypeManager;

import com.doublechaintech.retailscm.responsibilitytype.ResponsibilityTypeManager;

import com.doublechaintech.retailscm.terminationreason.TerminationReasonManager;

import com.doublechaintech.retailscm.terminationtype.TerminationTypeManager;

import com.doublechaintech.retailscm.occupationtype.OccupationTypeManager;

import com.doublechaintech.retailscm.leavetype.LeaveTypeManager;

import com.doublechaintech.retailscm.salarygrade.SalaryGradeManager;

import com.doublechaintech.retailscm.interviewtype.InterviewTypeManager;

import com.doublechaintech.retailscm.trainingcoursetype.TrainingCourseTypeManager;

import com.doublechaintech.retailscm.publicholiday.PublicHolidayManager;

import com.doublechaintech.retailscm.termination.TerminationManager;

import com.doublechaintech.retailscm.view.ViewManager;

import com.doublechaintech.retailscm.employee.EmployeeManager;

import com.doublechaintech.retailscm.jobapplication.JobApplicationManager;

import com.doublechaintech.retailscm.professioninterview.ProfessionInterviewManager;

import com.doublechaintech.retailscm.hrinterview.HrInterviewManager;

import com.doublechaintech.retailscm.offerapproval.OfferApprovalManager;

import com.doublechaintech.retailscm.offeracceptance.OfferAcceptanceManager;

import com.doublechaintech.retailscm.employeeboarding.EmployeeBoardingManager;

import com.doublechaintech.retailscm.instructor.InstructorManager;

import com.doublechaintech.retailscm.companytraining.CompanyTrainingManager;

import com.doublechaintech.retailscm.scoring.ScoringManager;

import com.doublechaintech.retailscm.employeecompanytraining.EmployeeCompanyTrainingManager;

import com.doublechaintech.retailscm.employeeskill.EmployeeSkillManager;

import com.doublechaintech.retailscm.employeeperformance.EmployeePerformanceManager;

import com.doublechaintech.retailscm.employeeworkexperience.EmployeeWorkExperienceManager;

import com.doublechaintech.retailscm.employeeleave.EmployeeLeaveManager;

import com.doublechaintech.retailscm.employeeinterview.EmployeeInterviewManager;

import com.doublechaintech.retailscm.employeeattendance.EmployeeAttendanceManager;

import com.doublechaintech.retailscm.employeequalifier.EmployeeQualifierManager;

import com.doublechaintech.retailscm.employeeeducation.EmployeeEducationManager;

import com.doublechaintech.retailscm.employeeaward.EmployeeAwardManager;

import com.doublechaintech.retailscm.employeesalarysheet.EmployeeSalarySheetManager;

import com.doublechaintech.retailscm.payingoff.PayingOffManager;

import com.doublechaintech.retailscm.userdomain.UserDomainManager;

import com.doublechaintech.retailscm.userwhitelist.UserWhiteListManager;

import com.doublechaintech.retailscm.secuser.SecUserManager;

import com.doublechaintech.retailscm.secuserblocking.SecUserBlockingManager;

import com.doublechaintech.retailscm.userapp.UserAppManager;

import com.doublechaintech.retailscm.listaccess.ListAccessManager;

import com.doublechaintech.retailscm.objectaccess.ObjectAccessManager;

import com.doublechaintech.retailscm.loginhistory.LoginHistoryManager;

import com.doublechaintech.retailscm.genericform.GenericFormManager;

import com.doublechaintech.retailscm.formmessage.FormMessageManager;

import com.doublechaintech.retailscm.formfieldmessage.FormFieldMessageManager;

import com.doublechaintech.retailscm.formfield.FormFieldManager;

import com.doublechaintech.retailscm.formaction.FormActionManager;


public class ManagerGroup {

	protected RetailStoreCountryCenterManager retailStoreCountryCenterManager;

	protected CatalogManager catalogManager;

	protected LevelOneCategoryManager levelOneCategoryManager;

	protected LevelTwoCategoryManager levelTwoCategoryManager;

	protected LevelThreeCategoryManager levelThreeCategoryManager;

	protected ProductManager productManager;

	protected SkuManager skuManager;

	protected RetailStoreProvinceCenterManager retailStoreProvinceCenterManager;

	protected ProvinceCenterDepartmentManager provinceCenterDepartmentManager;

	protected ProvinceCenterEmployeeManager provinceCenterEmployeeManager;

	protected RetailStoreCityServiceCenterManager retailStoreCityServiceCenterManager;

	protected CityPartnerManager cityPartnerManager;

	protected PotentialCustomerManager potentialCustomerManager;

	protected PotentialCustomerContactPersonManager potentialCustomerContactPersonManager;

	protected PotentialCustomerContactManager potentialCustomerContactManager;

	protected CityEventManager cityEventManager;

	protected EventAttendanceManager eventAttendanceManager;

	protected RetailStoreManager retailStoreManager;

	protected RetailStoreCreationManager retailStoreCreationManager;

	protected RetailStoreInvestmentInvitationManager retailStoreInvestmentInvitationManager;

	protected RetailStoreFranchisingManager retailStoreFranchisingManager;

	protected RetailStoreDecorationManager retailStoreDecorationManager;

	protected RetailStoreOpeningManager retailStoreOpeningManager;

	protected RetailStoreClosingManager retailStoreClosingManager;

	protected RetailStoreMemberManager retailStoreMemberManager;

	protected ConsumerOrderManager consumerOrderManager;

	protected ConsumerOrderConfirmationManager consumerOrderConfirmationManager;

	protected ConsumerOrderApprovalManager consumerOrderApprovalManager;

	protected ConsumerOrderProcessingManager consumerOrderProcessingManager;

	protected ConsumerOrderShipmentManager consumerOrderShipmentManager;

	protected ConsumerOrderDeliveryManager consumerOrderDeliveryManager;

	protected ConsumerOrderLineItemManager consumerOrderLineItemManager;

	protected ConsumerOrderShippingGroupManager consumerOrderShippingGroupManager;

	protected ConsumerOrderPaymentGroupManager consumerOrderPaymentGroupManager;

	protected ConsumerOrderPriceAdjustmentManager consumerOrderPriceAdjustmentManager;

	protected RetailStoreMemberCouponManager retailStoreMemberCouponManager;

	protected MemberWishlistManager memberWishlistManager;

	protected MemberRewardPointManager memberRewardPointManager;

	protected MemberRewardPointRedemptionManager memberRewardPointRedemptionManager;

	protected MemberWishlistProductManager memberWishlistProductManager;

	protected RetailStoreMemberAddressManager retailStoreMemberAddressManager;

	protected RetailStoreMemberGiftCardManager retailStoreMemberGiftCardManager;

	protected RetailStoreMemberGiftCardConsumeRecordManager retailStoreMemberGiftCardConsumeRecordManager;

	protected GoodsSupplierManager goodsSupplierManager;

	protected SupplierProductManager supplierProductManager;

	protected ProductSupplyDurationManager productSupplyDurationManager;

	protected SupplyOrderManager supplyOrderManager;

	protected SupplyOrderConfirmationManager supplyOrderConfirmationManager;

	protected SupplyOrderApprovalManager supplyOrderApprovalManager;

	protected SupplyOrderProcessingManager supplyOrderProcessingManager;

	protected SupplyOrderPickingManager supplyOrderPickingManager;

	protected SupplyOrderShipmentManager supplyOrderShipmentManager;

	protected SupplyOrderDeliveryManager supplyOrderDeliveryManager;

	protected SupplyOrderLineItemManager supplyOrderLineItemManager;

	protected SupplyOrderShippingGroupManager supplyOrderShippingGroupManager;

	protected SupplyOrderPaymentGroupManager supplyOrderPaymentGroupManager;

	protected RetailStoreOrderManager retailStoreOrderManager;

	protected RetailStoreOrderConfirmationManager retailStoreOrderConfirmationManager;

	protected RetailStoreOrderApprovalManager retailStoreOrderApprovalManager;

	protected RetailStoreOrderProcessingManager retailStoreOrderProcessingManager;

	protected RetailStoreOrderPickingManager retailStoreOrderPickingManager;

	protected RetailStoreOrderShipmentManager retailStoreOrderShipmentManager;

	protected RetailStoreOrderDeliveryManager retailStoreOrderDeliveryManager;

	protected RetailStoreOrderLineItemManager retailStoreOrderLineItemManager;

	protected RetailStoreOrderShippingGroupManager retailStoreOrderShippingGroupManager;

	protected RetailStoreOrderPaymentGroupManager retailStoreOrderPaymentGroupManager;

	protected WarehouseManager warehouseManager;

	protected StorageSpaceManager storageSpaceManager;

	protected SmartPalletManager smartPalletManager;

	protected GoodsShelfManager goodsShelfManager;

	protected GoodsShelfStockCountManager goodsShelfStockCountManager;

	protected StockCountIssueTrackManager stockCountIssueTrackManager;

	protected GoodsAllocationManager goodsAllocationManager;

	protected GoodsManager goodsManager;

	protected GoodsPackagingManager goodsPackagingManager;

	protected GoodsMovementManager goodsMovementManager;

	protected SupplierSpaceManager supplierSpaceManager;

	protected ReceivingSpaceManager receivingSpaceManager;

	protected ShippingSpaceManager shippingSpaceManager;

	protected DamageSpaceManager damageSpaceManager;

	protected WarehouseAssetManager warehouseAssetManager;

	protected TransportFleetManager transportFleetManager;

	protected TransportTruckManager transportTruckManager;

	protected TruckDriverManager truckDriverManager;

	protected TransportTaskManager transportTaskManager;

	protected TransportTaskTrackManager transportTaskTrackManager;

	protected AccountSetManager accountSetManager;

	protected AccountingSubjectManager accountingSubjectManager;

	protected AccountingPeriodManager accountingPeriodManager;

	protected AccountingDocumentTypeManager accountingDocumentTypeManager;

	protected AccountingDocumentManager accountingDocumentManager;

	protected AccountingDocumentCreationManager accountingDocumentCreationManager;

	protected AccountingDocumentConfirmationManager accountingDocumentConfirmationManager;

	protected AccountingDocumentAuditingManager accountingDocumentAuditingManager;

	protected AccountingDocumentPostingManager accountingDocumentPostingManager;

	protected OriginalVoucherManager originalVoucherManager;

	protected OriginalVoucherCreationManager originalVoucherCreationManager;

	protected OriginalVoucherConfirmationManager originalVoucherConfirmationManager;

	protected OriginalVoucherAuditingManager originalVoucherAuditingManager;

	protected AccountingDocumentLineManager accountingDocumentLineManager;

	protected LevelOneDepartmentManager levelOneDepartmentManager;

	protected LevelTwoDepartmentManager levelTwoDepartmentManager;

	protected LevelThreeDepartmentManager levelThreeDepartmentManager;

	protected SkillTypeManager skillTypeManager;

	protected ResponsibilityTypeManager responsibilityTypeManager;

	protected TerminationReasonManager terminationReasonManager;

	protected TerminationTypeManager terminationTypeManager;

	protected OccupationTypeManager occupationTypeManager;

	protected LeaveTypeManager leaveTypeManager;

	protected SalaryGradeManager salaryGradeManager;

	protected InterviewTypeManager interviewTypeManager;

	protected TrainingCourseTypeManager trainingCourseTypeManager;

	protected PublicHolidayManager publicHolidayManager;

	protected TerminationManager terminationManager;

	protected ViewManager viewManager;

	protected EmployeeManager employeeManager;

	protected JobApplicationManager jobApplicationManager;

	protected ProfessionInterviewManager professionInterviewManager;

	protected HrInterviewManager hrInterviewManager;

	protected OfferApprovalManager offerApprovalManager;

	protected OfferAcceptanceManager offerAcceptanceManager;

	protected EmployeeBoardingManager employeeBoardingManager;

	protected InstructorManager instructorManager;

	protected CompanyTrainingManager companyTrainingManager;

	protected ScoringManager scoringManager;

	protected EmployeeCompanyTrainingManager employeeCompanyTrainingManager;

	protected EmployeeSkillManager employeeSkillManager;

	protected EmployeePerformanceManager employeePerformanceManager;

	protected EmployeeWorkExperienceManager employeeWorkExperienceManager;

	protected EmployeeLeaveManager employeeLeaveManager;

	protected EmployeeInterviewManager employeeInterviewManager;

	protected EmployeeAttendanceManager employeeAttendanceManager;

	protected EmployeeQualifierManager employeeQualifierManager;

	protected EmployeeEducationManager employeeEducationManager;

	protected EmployeeAwardManager employeeAwardManager;

	protected EmployeeSalarySheetManager employeeSalarySheetManager;

	protected PayingOffManager payingOffManager;

	protected UserDomainManager userDomainManager;

	protected UserWhiteListManager userWhiteListManager;

	protected SecUserManager secUserManager;

	protected SecUserBlockingManager secUserBlockingManager;

	protected UserAppManager userAppManager;

	protected ListAccessManager listAccessManager;

	protected ObjectAccessManager objectAccessManager;

	protected LoginHistoryManager loginHistoryManager;

	protected GenericFormManager genericFormManager;

	protected FormMessageManager formMessageManager;

	protected FormFieldMessageManager formFieldMessageManager;

	protected FormFieldManager formFieldManager;

	protected FormActionManager formActionManager;

	

	public RetailStoreCountryCenterManager getRetailStoreCountryCenterManager(){
		return this.retailStoreCountryCenterManager;
	}
	public void setRetailStoreCountryCenterManager(RetailStoreCountryCenterManager manager){
		this.retailStoreCountryCenterManager = manager;
	}


	public CatalogManager getCatalogManager(){
		return this.catalogManager;
	}
	public void setCatalogManager(CatalogManager manager){
		this.catalogManager = manager;
	}


	public LevelOneCategoryManager getLevelOneCategoryManager(){
		return this.levelOneCategoryManager;
	}
	public void setLevelOneCategoryManager(LevelOneCategoryManager manager){
		this.levelOneCategoryManager = manager;
	}


	public LevelTwoCategoryManager getLevelTwoCategoryManager(){
		return this.levelTwoCategoryManager;
	}
	public void setLevelTwoCategoryManager(LevelTwoCategoryManager manager){
		this.levelTwoCategoryManager = manager;
	}


	public LevelThreeCategoryManager getLevelThreeCategoryManager(){
		return this.levelThreeCategoryManager;
	}
	public void setLevelThreeCategoryManager(LevelThreeCategoryManager manager){
		this.levelThreeCategoryManager = manager;
	}


	public ProductManager getProductManager(){
		return this.productManager;
	}
	public void setProductManager(ProductManager manager){
		this.productManager = manager;
	}


	public SkuManager getSkuManager(){
		return this.skuManager;
	}
	public void setSkuManager(SkuManager manager){
		this.skuManager = manager;
	}


	public RetailStoreProvinceCenterManager getRetailStoreProvinceCenterManager(){
		return this.retailStoreProvinceCenterManager;
	}
	public void setRetailStoreProvinceCenterManager(RetailStoreProvinceCenterManager manager){
		this.retailStoreProvinceCenterManager = manager;
	}


	public ProvinceCenterDepartmentManager getProvinceCenterDepartmentManager(){
		return this.provinceCenterDepartmentManager;
	}
	public void setProvinceCenterDepartmentManager(ProvinceCenterDepartmentManager manager){
		this.provinceCenterDepartmentManager = manager;
	}


	public ProvinceCenterEmployeeManager getProvinceCenterEmployeeManager(){
		return this.provinceCenterEmployeeManager;
	}
	public void setProvinceCenterEmployeeManager(ProvinceCenterEmployeeManager manager){
		this.provinceCenterEmployeeManager = manager;
	}


	public RetailStoreCityServiceCenterManager getRetailStoreCityServiceCenterManager(){
		return this.retailStoreCityServiceCenterManager;
	}
	public void setRetailStoreCityServiceCenterManager(RetailStoreCityServiceCenterManager manager){
		this.retailStoreCityServiceCenterManager = manager;
	}


	public CityPartnerManager getCityPartnerManager(){
		return this.cityPartnerManager;
	}
	public void setCityPartnerManager(CityPartnerManager manager){
		this.cityPartnerManager = manager;
	}


	public PotentialCustomerManager getPotentialCustomerManager(){
		return this.potentialCustomerManager;
	}
	public void setPotentialCustomerManager(PotentialCustomerManager manager){
		this.potentialCustomerManager = manager;
	}


	public PotentialCustomerContactPersonManager getPotentialCustomerContactPersonManager(){
		return this.potentialCustomerContactPersonManager;
	}
	public void setPotentialCustomerContactPersonManager(PotentialCustomerContactPersonManager manager){
		this.potentialCustomerContactPersonManager = manager;
	}


	public PotentialCustomerContactManager getPotentialCustomerContactManager(){
		return this.potentialCustomerContactManager;
	}
	public void setPotentialCustomerContactManager(PotentialCustomerContactManager manager){
		this.potentialCustomerContactManager = manager;
	}


	public CityEventManager getCityEventManager(){
		return this.cityEventManager;
	}
	public void setCityEventManager(CityEventManager manager){
		this.cityEventManager = manager;
	}


	public EventAttendanceManager getEventAttendanceManager(){
		return this.eventAttendanceManager;
	}
	public void setEventAttendanceManager(EventAttendanceManager manager){
		this.eventAttendanceManager = manager;
	}


	public RetailStoreManager getRetailStoreManager(){
		return this.retailStoreManager;
	}
	public void setRetailStoreManager(RetailStoreManager manager){
		this.retailStoreManager = manager;
	}


	public RetailStoreCreationManager getRetailStoreCreationManager(){
		return this.retailStoreCreationManager;
	}
	public void setRetailStoreCreationManager(RetailStoreCreationManager manager){
		this.retailStoreCreationManager = manager;
	}


	public RetailStoreInvestmentInvitationManager getRetailStoreInvestmentInvitationManager(){
		return this.retailStoreInvestmentInvitationManager;
	}
	public void setRetailStoreInvestmentInvitationManager(RetailStoreInvestmentInvitationManager manager){
		this.retailStoreInvestmentInvitationManager = manager;
	}


	public RetailStoreFranchisingManager getRetailStoreFranchisingManager(){
		return this.retailStoreFranchisingManager;
	}
	public void setRetailStoreFranchisingManager(RetailStoreFranchisingManager manager){
		this.retailStoreFranchisingManager = manager;
	}


	public RetailStoreDecorationManager getRetailStoreDecorationManager(){
		return this.retailStoreDecorationManager;
	}
	public void setRetailStoreDecorationManager(RetailStoreDecorationManager manager){
		this.retailStoreDecorationManager = manager;
	}


	public RetailStoreOpeningManager getRetailStoreOpeningManager(){
		return this.retailStoreOpeningManager;
	}
	public void setRetailStoreOpeningManager(RetailStoreOpeningManager manager){
		this.retailStoreOpeningManager = manager;
	}


	public RetailStoreClosingManager getRetailStoreClosingManager(){
		return this.retailStoreClosingManager;
	}
	public void setRetailStoreClosingManager(RetailStoreClosingManager manager){
		this.retailStoreClosingManager = manager;
	}


	public RetailStoreMemberManager getRetailStoreMemberManager(){
		return this.retailStoreMemberManager;
	}
	public void setRetailStoreMemberManager(RetailStoreMemberManager manager){
		this.retailStoreMemberManager = manager;
	}


	public ConsumerOrderManager getConsumerOrderManager(){
		return this.consumerOrderManager;
	}
	public void setConsumerOrderManager(ConsumerOrderManager manager){
		this.consumerOrderManager = manager;
	}


	public ConsumerOrderConfirmationManager getConsumerOrderConfirmationManager(){
		return this.consumerOrderConfirmationManager;
	}
	public void setConsumerOrderConfirmationManager(ConsumerOrderConfirmationManager manager){
		this.consumerOrderConfirmationManager = manager;
	}


	public ConsumerOrderApprovalManager getConsumerOrderApprovalManager(){
		return this.consumerOrderApprovalManager;
	}
	public void setConsumerOrderApprovalManager(ConsumerOrderApprovalManager manager){
		this.consumerOrderApprovalManager = manager;
	}


	public ConsumerOrderProcessingManager getConsumerOrderProcessingManager(){
		return this.consumerOrderProcessingManager;
	}
	public void setConsumerOrderProcessingManager(ConsumerOrderProcessingManager manager){
		this.consumerOrderProcessingManager = manager;
	}


	public ConsumerOrderShipmentManager getConsumerOrderShipmentManager(){
		return this.consumerOrderShipmentManager;
	}
	public void setConsumerOrderShipmentManager(ConsumerOrderShipmentManager manager){
		this.consumerOrderShipmentManager = manager;
	}


	public ConsumerOrderDeliveryManager getConsumerOrderDeliveryManager(){
		return this.consumerOrderDeliveryManager;
	}
	public void setConsumerOrderDeliveryManager(ConsumerOrderDeliveryManager manager){
		this.consumerOrderDeliveryManager = manager;
	}


	public ConsumerOrderLineItemManager getConsumerOrderLineItemManager(){
		return this.consumerOrderLineItemManager;
	}
	public void setConsumerOrderLineItemManager(ConsumerOrderLineItemManager manager){
		this.consumerOrderLineItemManager = manager;
	}


	public ConsumerOrderShippingGroupManager getConsumerOrderShippingGroupManager(){
		return this.consumerOrderShippingGroupManager;
	}
	public void setConsumerOrderShippingGroupManager(ConsumerOrderShippingGroupManager manager){
		this.consumerOrderShippingGroupManager = manager;
	}


	public ConsumerOrderPaymentGroupManager getConsumerOrderPaymentGroupManager(){
		return this.consumerOrderPaymentGroupManager;
	}
	public void setConsumerOrderPaymentGroupManager(ConsumerOrderPaymentGroupManager manager){
		this.consumerOrderPaymentGroupManager = manager;
	}


	public ConsumerOrderPriceAdjustmentManager getConsumerOrderPriceAdjustmentManager(){
		return this.consumerOrderPriceAdjustmentManager;
	}
	public void setConsumerOrderPriceAdjustmentManager(ConsumerOrderPriceAdjustmentManager manager){
		this.consumerOrderPriceAdjustmentManager = manager;
	}


	public RetailStoreMemberCouponManager getRetailStoreMemberCouponManager(){
		return this.retailStoreMemberCouponManager;
	}
	public void setRetailStoreMemberCouponManager(RetailStoreMemberCouponManager manager){
		this.retailStoreMemberCouponManager = manager;
	}


	public MemberWishlistManager getMemberWishlistManager(){
		return this.memberWishlistManager;
	}
	public void setMemberWishlistManager(MemberWishlistManager manager){
		this.memberWishlistManager = manager;
	}


	public MemberRewardPointManager getMemberRewardPointManager(){
		return this.memberRewardPointManager;
	}
	public void setMemberRewardPointManager(MemberRewardPointManager manager){
		this.memberRewardPointManager = manager;
	}


	public MemberRewardPointRedemptionManager getMemberRewardPointRedemptionManager(){
		return this.memberRewardPointRedemptionManager;
	}
	public void setMemberRewardPointRedemptionManager(MemberRewardPointRedemptionManager manager){
		this.memberRewardPointRedemptionManager = manager;
	}


	public MemberWishlistProductManager getMemberWishlistProductManager(){
		return this.memberWishlistProductManager;
	}
	public void setMemberWishlistProductManager(MemberWishlistProductManager manager){
		this.memberWishlistProductManager = manager;
	}


	public RetailStoreMemberAddressManager getRetailStoreMemberAddressManager(){
		return this.retailStoreMemberAddressManager;
	}
	public void setRetailStoreMemberAddressManager(RetailStoreMemberAddressManager manager){
		this.retailStoreMemberAddressManager = manager;
	}


	public RetailStoreMemberGiftCardManager getRetailStoreMemberGiftCardManager(){
		return this.retailStoreMemberGiftCardManager;
	}
	public void setRetailStoreMemberGiftCardManager(RetailStoreMemberGiftCardManager manager){
		this.retailStoreMemberGiftCardManager = manager;
	}


	public RetailStoreMemberGiftCardConsumeRecordManager getRetailStoreMemberGiftCardConsumeRecordManager(){
		return this.retailStoreMemberGiftCardConsumeRecordManager;
	}
	public void setRetailStoreMemberGiftCardConsumeRecordManager(RetailStoreMemberGiftCardConsumeRecordManager manager){
		this.retailStoreMemberGiftCardConsumeRecordManager = manager;
	}


	public GoodsSupplierManager getGoodsSupplierManager(){
		return this.goodsSupplierManager;
	}
	public void setGoodsSupplierManager(GoodsSupplierManager manager){
		this.goodsSupplierManager = manager;
	}


	public SupplierProductManager getSupplierProductManager(){
		return this.supplierProductManager;
	}
	public void setSupplierProductManager(SupplierProductManager manager){
		this.supplierProductManager = manager;
	}


	public ProductSupplyDurationManager getProductSupplyDurationManager(){
		return this.productSupplyDurationManager;
	}
	public void setProductSupplyDurationManager(ProductSupplyDurationManager manager){
		this.productSupplyDurationManager = manager;
	}


	public SupplyOrderManager getSupplyOrderManager(){
		return this.supplyOrderManager;
	}
	public void setSupplyOrderManager(SupplyOrderManager manager){
		this.supplyOrderManager = manager;
	}


	public SupplyOrderConfirmationManager getSupplyOrderConfirmationManager(){
		return this.supplyOrderConfirmationManager;
	}
	public void setSupplyOrderConfirmationManager(SupplyOrderConfirmationManager manager){
		this.supplyOrderConfirmationManager = manager;
	}


	public SupplyOrderApprovalManager getSupplyOrderApprovalManager(){
		return this.supplyOrderApprovalManager;
	}
	public void setSupplyOrderApprovalManager(SupplyOrderApprovalManager manager){
		this.supplyOrderApprovalManager = manager;
	}


	public SupplyOrderProcessingManager getSupplyOrderProcessingManager(){
		return this.supplyOrderProcessingManager;
	}
	public void setSupplyOrderProcessingManager(SupplyOrderProcessingManager manager){
		this.supplyOrderProcessingManager = manager;
	}


	public SupplyOrderPickingManager getSupplyOrderPickingManager(){
		return this.supplyOrderPickingManager;
	}
	public void setSupplyOrderPickingManager(SupplyOrderPickingManager manager){
		this.supplyOrderPickingManager = manager;
	}


	public SupplyOrderShipmentManager getSupplyOrderShipmentManager(){
		return this.supplyOrderShipmentManager;
	}
	public void setSupplyOrderShipmentManager(SupplyOrderShipmentManager manager){
		this.supplyOrderShipmentManager = manager;
	}


	public SupplyOrderDeliveryManager getSupplyOrderDeliveryManager(){
		return this.supplyOrderDeliveryManager;
	}
	public void setSupplyOrderDeliveryManager(SupplyOrderDeliveryManager manager){
		this.supplyOrderDeliveryManager = manager;
	}


	public SupplyOrderLineItemManager getSupplyOrderLineItemManager(){
		return this.supplyOrderLineItemManager;
	}
	public void setSupplyOrderLineItemManager(SupplyOrderLineItemManager manager){
		this.supplyOrderLineItemManager = manager;
	}


	public SupplyOrderShippingGroupManager getSupplyOrderShippingGroupManager(){
		return this.supplyOrderShippingGroupManager;
	}
	public void setSupplyOrderShippingGroupManager(SupplyOrderShippingGroupManager manager){
		this.supplyOrderShippingGroupManager = manager;
	}


	public SupplyOrderPaymentGroupManager getSupplyOrderPaymentGroupManager(){
		return this.supplyOrderPaymentGroupManager;
	}
	public void setSupplyOrderPaymentGroupManager(SupplyOrderPaymentGroupManager manager){
		this.supplyOrderPaymentGroupManager = manager;
	}


	public RetailStoreOrderManager getRetailStoreOrderManager(){
		return this.retailStoreOrderManager;
	}
	public void setRetailStoreOrderManager(RetailStoreOrderManager manager){
		this.retailStoreOrderManager = manager;
	}


	public RetailStoreOrderConfirmationManager getRetailStoreOrderConfirmationManager(){
		return this.retailStoreOrderConfirmationManager;
	}
	public void setRetailStoreOrderConfirmationManager(RetailStoreOrderConfirmationManager manager){
		this.retailStoreOrderConfirmationManager = manager;
	}


	public RetailStoreOrderApprovalManager getRetailStoreOrderApprovalManager(){
		return this.retailStoreOrderApprovalManager;
	}
	public void setRetailStoreOrderApprovalManager(RetailStoreOrderApprovalManager manager){
		this.retailStoreOrderApprovalManager = manager;
	}


	public RetailStoreOrderProcessingManager getRetailStoreOrderProcessingManager(){
		return this.retailStoreOrderProcessingManager;
	}
	public void setRetailStoreOrderProcessingManager(RetailStoreOrderProcessingManager manager){
		this.retailStoreOrderProcessingManager = manager;
	}


	public RetailStoreOrderPickingManager getRetailStoreOrderPickingManager(){
		return this.retailStoreOrderPickingManager;
	}
	public void setRetailStoreOrderPickingManager(RetailStoreOrderPickingManager manager){
		this.retailStoreOrderPickingManager = manager;
	}


	public RetailStoreOrderShipmentManager getRetailStoreOrderShipmentManager(){
		return this.retailStoreOrderShipmentManager;
	}
	public void setRetailStoreOrderShipmentManager(RetailStoreOrderShipmentManager manager){
		this.retailStoreOrderShipmentManager = manager;
	}


	public RetailStoreOrderDeliveryManager getRetailStoreOrderDeliveryManager(){
		return this.retailStoreOrderDeliveryManager;
	}
	public void setRetailStoreOrderDeliveryManager(RetailStoreOrderDeliveryManager manager){
		this.retailStoreOrderDeliveryManager = manager;
	}


	public RetailStoreOrderLineItemManager getRetailStoreOrderLineItemManager(){
		return this.retailStoreOrderLineItemManager;
	}
	public void setRetailStoreOrderLineItemManager(RetailStoreOrderLineItemManager manager){
		this.retailStoreOrderLineItemManager = manager;
	}


	public RetailStoreOrderShippingGroupManager getRetailStoreOrderShippingGroupManager(){
		return this.retailStoreOrderShippingGroupManager;
	}
	public void setRetailStoreOrderShippingGroupManager(RetailStoreOrderShippingGroupManager manager){
		this.retailStoreOrderShippingGroupManager = manager;
	}


	public RetailStoreOrderPaymentGroupManager getRetailStoreOrderPaymentGroupManager(){
		return this.retailStoreOrderPaymentGroupManager;
	}
	public void setRetailStoreOrderPaymentGroupManager(RetailStoreOrderPaymentGroupManager manager){
		this.retailStoreOrderPaymentGroupManager = manager;
	}


	public WarehouseManager getWarehouseManager(){
		return this.warehouseManager;
	}
	public void setWarehouseManager(WarehouseManager manager){
		this.warehouseManager = manager;
	}


	public StorageSpaceManager getStorageSpaceManager(){
		return this.storageSpaceManager;
	}
	public void setStorageSpaceManager(StorageSpaceManager manager){
		this.storageSpaceManager = manager;
	}


	public SmartPalletManager getSmartPalletManager(){
		return this.smartPalletManager;
	}
	public void setSmartPalletManager(SmartPalletManager manager){
		this.smartPalletManager = manager;
	}


	public GoodsShelfManager getGoodsShelfManager(){
		return this.goodsShelfManager;
	}
	public void setGoodsShelfManager(GoodsShelfManager manager){
		this.goodsShelfManager = manager;
	}


	public GoodsShelfStockCountManager getGoodsShelfStockCountManager(){
		return this.goodsShelfStockCountManager;
	}
	public void setGoodsShelfStockCountManager(GoodsShelfStockCountManager manager){
		this.goodsShelfStockCountManager = manager;
	}


	public StockCountIssueTrackManager getStockCountIssueTrackManager(){
		return this.stockCountIssueTrackManager;
	}
	public void setStockCountIssueTrackManager(StockCountIssueTrackManager manager){
		this.stockCountIssueTrackManager = manager;
	}


	public GoodsAllocationManager getGoodsAllocationManager(){
		return this.goodsAllocationManager;
	}
	public void setGoodsAllocationManager(GoodsAllocationManager manager){
		this.goodsAllocationManager = manager;
	}


	public GoodsManager getGoodsManager(){
		return this.goodsManager;
	}
	public void setGoodsManager(GoodsManager manager){
		this.goodsManager = manager;
	}


	public GoodsPackagingManager getGoodsPackagingManager(){
		return this.goodsPackagingManager;
	}
	public void setGoodsPackagingManager(GoodsPackagingManager manager){
		this.goodsPackagingManager = manager;
	}


	public GoodsMovementManager getGoodsMovementManager(){
		return this.goodsMovementManager;
	}
	public void setGoodsMovementManager(GoodsMovementManager manager){
		this.goodsMovementManager = manager;
	}


	public SupplierSpaceManager getSupplierSpaceManager(){
		return this.supplierSpaceManager;
	}
	public void setSupplierSpaceManager(SupplierSpaceManager manager){
		this.supplierSpaceManager = manager;
	}


	public ReceivingSpaceManager getReceivingSpaceManager(){
		return this.receivingSpaceManager;
	}
	public void setReceivingSpaceManager(ReceivingSpaceManager manager){
		this.receivingSpaceManager = manager;
	}


	public ShippingSpaceManager getShippingSpaceManager(){
		return this.shippingSpaceManager;
	}
	public void setShippingSpaceManager(ShippingSpaceManager manager){
		this.shippingSpaceManager = manager;
	}


	public DamageSpaceManager getDamageSpaceManager(){
		return this.damageSpaceManager;
	}
	public void setDamageSpaceManager(DamageSpaceManager manager){
		this.damageSpaceManager = manager;
	}


	public WarehouseAssetManager getWarehouseAssetManager(){
		return this.warehouseAssetManager;
	}
	public void setWarehouseAssetManager(WarehouseAssetManager manager){
		this.warehouseAssetManager = manager;
	}


	public TransportFleetManager getTransportFleetManager(){
		return this.transportFleetManager;
	}
	public void setTransportFleetManager(TransportFleetManager manager){
		this.transportFleetManager = manager;
	}


	public TransportTruckManager getTransportTruckManager(){
		return this.transportTruckManager;
	}
	public void setTransportTruckManager(TransportTruckManager manager){
		this.transportTruckManager = manager;
	}


	public TruckDriverManager getTruckDriverManager(){
		return this.truckDriverManager;
	}
	public void setTruckDriverManager(TruckDriverManager manager){
		this.truckDriverManager = manager;
	}


	public TransportTaskManager getTransportTaskManager(){
		return this.transportTaskManager;
	}
	public void setTransportTaskManager(TransportTaskManager manager){
		this.transportTaskManager = manager;
	}


	public TransportTaskTrackManager getTransportTaskTrackManager(){
		return this.transportTaskTrackManager;
	}
	public void setTransportTaskTrackManager(TransportTaskTrackManager manager){
		this.transportTaskTrackManager = manager;
	}


	public AccountSetManager getAccountSetManager(){
		return this.accountSetManager;
	}
	public void setAccountSetManager(AccountSetManager manager){
		this.accountSetManager = manager;
	}


	public AccountingSubjectManager getAccountingSubjectManager(){
		return this.accountingSubjectManager;
	}
	public void setAccountingSubjectManager(AccountingSubjectManager manager){
		this.accountingSubjectManager = manager;
	}


	public AccountingPeriodManager getAccountingPeriodManager(){
		return this.accountingPeriodManager;
	}
	public void setAccountingPeriodManager(AccountingPeriodManager manager){
		this.accountingPeriodManager = manager;
	}


	public AccountingDocumentTypeManager getAccountingDocumentTypeManager(){
		return this.accountingDocumentTypeManager;
	}
	public void setAccountingDocumentTypeManager(AccountingDocumentTypeManager manager){
		this.accountingDocumentTypeManager = manager;
	}


	public AccountingDocumentManager getAccountingDocumentManager(){
		return this.accountingDocumentManager;
	}
	public void setAccountingDocumentManager(AccountingDocumentManager manager){
		this.accountingDocumentManager = manager;
	}


	public AccountingDocumentCreationManager getAccountingDocumentCreationManager(){
		return this.accountingDocumentCreationManager;
	}
	public void setAccountingDocumentCreationManager(AccountingDocumentCreationManager manager){
		this.accountingDocumentCreationManager = manager;
	}


	public AccountingDocumentConfirmationManager getAccountingDocumentConfirmationManager(){
		return this.accountingDocumentConfirmationManager;
	}
	public void setAccountingDocumentConfirmationManager(AccountingDocumentConfirmationManager manager){
		this.accountingDocumentConfirmationManager = manager;
	}


	public AccountingDocumentAuditingManager getAccountingDocumentAuditingManager(){
		return this.accountingDocumentAuditingManager;
	}
	public void setAccountingDocumentAuditingManager(AccountingDocumentAuditingManager manager){
		this.accountingDocumentAuditingManager = manager;
	}


	public AccountingDocumentPostingManager getAccountingDocumentPostingManager(){
		return this.accountingDocumentPostingManager;
	}
	public void setAccountingDocumentPostingManager(AccountingDocumentPostingManager manager){
		this.accountingDocumentPostingManager = manager;
	}


	public OriginalVoucherManager getOriginalVoucherManager(){
		return this.originalVoucherManager;
	}
	public void setOriginalVoucherManager(OriginalVoucherManager manager){
		this.originalVoucherManager = manager;
	}


	public OriginalVoucherCreationManager getOriginalVoucherCreationManager(){
		return this.originalVoucherCreationManager;
	}
	public void setOriginalVoucherCreationManager(OriginalVoucherCreationManager manager){
		this.originalVoucherCreationManager = manager;
	}


	public OriginalVoucherConfirmationManager getOriginalVoucherConfirmationManager(){
		return this.originalVoucherConfirmationManager;
	}
	public void setOriginalVoucherConfirmationManager(OriginalVoucherConfirmationManager manager){
		this.originalVoucherConfirmationManager = manager;
	}


	public OriginalVoucherAuditingManager getOriginalVoucherAuditingManager(){
		return this.originalVoucherAuditingManager;
	}
	public void setOriginalVoucherAuditingManager(OriginalVoucherAuditingManager manager){
		this.originalVoucherAuditingManager = manager;
	}


	public AccountingDocumentLineManager getAccountingDocumentLineManager(){
		return this.accountingDocumentLineManager;
	}
	public void setAccountingDocumentLineManager(AccountingDocumentLineManager manager){
		this.accountingDocumentLineManager = manager;
	}


	public LevelOneDepartmentManager getLevelOneDepartmentManager(){
		return this.levelOneDepartmentManager;
	}
	public void setLevelOneDepartmentManager(LevelOneDepartmentManager manager){
		this.levelOneDepartmentManager = manager;
	}


	public LevelTwoDepartmentManager getLevelTwoDepartmentManager(){
		return this.levelTwoDepartmentManager;
	}
	public void setLevelTwoDepartmentManager(LevelTwoDepartmentManager manager){
		this.levelTwoDepartmentManager = manager;
	}


	public LevelThreeDepartmentManager getLevelThreeDepartmentManager(){
		return this.levelThreeDepartmentManager;
	}
	public void setLevelThreeDepartmentManager(LevelThreeDepartmentManager manager){
		this.levelThreeDepartmentManager = manager;
	}


	public SkillTypeManager getSkillTypeManager(){
		return this.skillTypeManager;
	}
	public void setSkillTypeManager(SkillTypeManager manager){
		this.skillTypeManager = manager;
	}


	public ResponsibilityTypeManager getResponsibilityTypeManager(){
		return this.responsibilityTypeManager;
	}
	public void setResponsibilityTypeManager(ResponsibilityTypeManager manager){
		this.responsibilityTypeManager = manager;
	}


	public TerminationReasonManager getTerminationReasonManager(){
		return this.terminationReasonManager;
	}
	public void setTerminationReasonManager(TerminationReasonManager manager){
		this.terminationReasonManager = manager;
	}


	public TerminationTypeManager getTerminationTypeManager(){
		return this.terminationTypeManager;
	}
	public void setTerminationTypeManager(TerminationTypeManager manager){
		this.terminationTypeManager = manager;
	}


	public OccupationTypeManager getOccupationTypeManager(){
		return this.occupationTypeManager;
	}
	public void setOccupationTypeManager(OccupationTypeManager manager){
		this.occupationTypeManager = manager;
	}


	public LeaveTypeManager getLeaveTypeManager(){
		return this.leaveTypeManager;
	}
	public void setLeaveTypeManager(LeaveTypeManager manager){
		this.leaveTypeManager = manager;
	}


	public SalaryGradeManager getSalaryGradeManager(){
		return this.salaryGradeManager;
	}
	public void setSalaryGradeManager(SalaryGradeManager manager){
		this.salaryGradeManager = manager;
	}


	public InterviewTypeManager getInterviewTypeManager(){
		return this.interviewTypeManager;
	}
	public void setInterviewTypeManager(InterviewTypeManager manager){
		this.interviewTypeManager = manager;
	}


	public TrainingCourseTypeManager getTrainingCourseTypeManager(){
		return this.trainingCourseTypeManager;
	}
	public void setTrainingCourseTypeManager(TrainingCourseTypeManager manager){
		this.trainingCourseTypeManager = manager;
	}


	public PublicHolidayManager getPublicHolidayManager(){
		return this.publicHolidayManager;
	}
	public void setPublicHolidayManager(PublicHolidayManager manager){
		this.publicHolidayManager = manager;
	}


	public TerminationManager getTerminationManager(){
		return this.terminationManager;
	}
	public void setTerminationManager(TerminationManager manager){
		this.terminationManager = manager;
	}


	public ViewManager getViewManager(){
		return this.viewManager;
	}
	public void setViewManager(ViewManager manager){
		this.viewManager = manager;
	}


	public EmployeeManager getEmployeeManager(){
		return this.employeeManager;
	}
	public void setEmployeeManager(EmployeeManager manager){
		this.employeeManager = manager;
	}


	public JobApplicationManager getJobApplicationManager(){
		return this.jobApplicationManager;
	}
	public void setJobApplicationManager(JobApplicationManager manager){
		this.jobApplicationManager = manager;
	}


	public ProfessionInterviewManager getProfessionInterviewManager(){
		return this.professionInterviewManager;
	}
	public void setProfessionInterviewManager(ProfessionInterviewManager manager){
		this.professionInterviewManager = manager;
	}


	public HrInterviewManager getHrInterviewManager(){
		return this.hrInterviewManager;
	}
	public void setHrInterviewManager(HrInterviewManager manager){
		this.hrInterviewManager = manager;
	}


	public OfferApprovalManager getOfferApprovalManager(){
		return this.offerApprovalManager;
	}
	public void setOfferApprovalManager(OfferApprovalManager manager){
		this.offerApprovalManager = manager;
	}


	public OfferAcceptanceManager getOfferAcceptanceManager(){
		return this.offerAcceptanceManager;
	}
	public void setOfferAcceptanceManager(OfferAcceptanceManager manager){
		this.offerAcceptanceManager = manager;
	}


	public EmployeeBoardingManager getEmployeeBoardingManager(){
		return this.employeeBoardingManager;
	}
	public void setEmployeeBoardingManager(EmployeeBoardingManager manager){
		this.employeeBoardingManager = manager;
	}


	public InstructorManager getInstructorManager(){
		return this.instructorManager;
	}
	public void setInstructorManager(InstructorManager manager){
		this.instructorManager = manager;
	}


	public CompanyTrainingManager getCompanyTrainingManager(){
		return this.companyTrainingManager;
	}
	public void setCompanyTrainingManager(CompanyTrainingManager manager){
		this.companyTrainingManager = manager;
	}


	public ScoringManager getScoringManager(){
		return this.scoringManager;
	}
	public void setScoringManager(ScoringManager manager){
		this.scoringManager = manager;
	}


	public EmployeeCompanyTrainingManager getEmployeeCompanyTrainingManager(){
		return this.employeeCompanyTrainingManager;
	}
	public void setEmployeeCompanyTrainingManager(EmployeeCompanyTrainingManager manager){
		this.employeeCompanyTrainingManager = manager;
	}


	public EmployeeSkillManager getEmployeeSkillManager(){
		return this.employeeSkillManager;
	}
	public void setEmployeeSkillManager(EmployeeSkillManager manager){
		this.employeeSkillManager = manager;
	}


	public EmployeePerformanceManager getEmployeePerformanceManager(){
		return this.employeePerformanceManager;
	}
	public void setEmployeePerformanceManager(EmployeePerformanceManager manager){
		this.employeePerformanceManager = manager;
	}


	public EmployeeWorkExperienceManager getEmployeeWorkExperienceManager(){
		return this.employeeWorkExperienceManager;
	}
	public void setEmployeeWorkExperienceManager(EmployeeWorkExperienceManager manager){
		this.employeeWorkExperienceManager = manager;
	}


	public EmployeeLeaveManager getEmployeeLeaveManager(){
		return this.employeeLeaveManager;
	}
	public void setEmployeeLeaveManager(EmployeeLeaveManager manager){
		this.employeeLeaveManager = manager;
	}


	public EmployeeInterviewManager getEmployeeInterviewManager(){
		return this.employeeInterviewManager;
	}
	public void setEmployeeInterviewManager(EmployeeInterviewManager manager){
		this.employeeInterviewManager = manager;
	}


	public EmployeeAttendanceManager getEmployeeAttendanceManager(){
		return this.employeeAttendanceManager;
	}
	public void setEmployeeAttendanceManager(EmployeeAttendanceManager manager){
		this.employeeAttendanceManager = manager;
	}


	public EmployeeQualifierManager getEmployeeQualifierManager(){
		return this.employeeQualifierManager;
	}
	public void setEmployeeQualifierManager(EmployeeQualifierManager manager){
		this.employeeQualifierManager = manager;
	}


	public EmployeeEducationManager getEmployeeEducationManager(){
		return this.employeeEducationManager;
	}
	public void setEmployeeEducationManager(EmployeeEducationManager manager){
		this.employeeEducationManager = manager;
	}


	public EmployeeAwardManager getEmployeeAwardManager(){
		return this.employeeAwardManager;
	}
	public void setEmployeeAwardManager(EmployeeAwardManager manager){
		this.employeeAwardManager = manager;
	}


	public EmployeeSalarySheetManager getEmployeeSalarySheetManager(){
		return this.employeeSalarySheetManager;
	}
	public void setEmployeeSalarySheetManager(EmployeeSalarySheetManager manager){
		this.employeeSalarySheetManager = manager;
	}


	public PayingOffManager getPayingOffManager(){
		return this.payingOffManager;
	}
	public void setPayingOffManager(PayingOffManager manager){
		this.payingOffManager = manager;
	}


	public UserDomainManager getUserDomainManager(){
		return this.userDomainManager;
	}
	public void setUserDomainManager(UserDomainManager manager){
		this.userDomainManager = manager;
	}


	public UserWhiteListManager getUserWhiteListManager(){
		return this.userWhiteListManager;
	}
	public void setUserWhiteListManager(UserWhiteListManager manager){
		this.userWhiteListManager = manager;
	}


	public SecUserManager getSecUserManager(){
		return this.secUserManager;
	}
	public void setSecUserManager(SecUserManager manager){
		this.secUserManager = manager;
	}


	public SecUserBlockingManager getSecUserBlockingManager(){
		return this.secUserBlockingManager;
	}
	public void setSecUserBlockingManager(SecUserBlockingManager manager){
		this.secUserBlockingManager = manager;
	}


	public UserAppManager getUserAppManager(){
		return this.userAppManager;
	}
	public void setUserAppManager(UserAppManager manager){
		this.userAppManager = manager;
	}


	public ListAccessManager getListAccessManager(){
		return this.listAccessManager;
	}
	public void setListAccessManager(ListAccessManager manager){
		this.listAccessManager = manager;
	}


	public ObjectAccessManager getObjectAccessManager(){
		return this.objectAccessManager;
	}
	public void setObjectAccessManager(ObjectAccessManager manager){
		this.objectAccessManager = manager;
	}


	public LoginHistoryManager getLoginHistoryManager(){
		return this.loginHistoryManager;
	}
	public void setLoginHistoryManager(LoginHistoryManager manager){
		this.loginHistoryManager = manager;
	}


	public GenericFormManager getGenericFormManager(){
		return this.genericFormManager;
	}
	public void setGenericFormManager(GenericFormManager manager){
		this.genericFormManager = manager;
	}


	public FormMessageManager getFormMessageManager(){
		return this.formMessageManager;
	}
	public void setFormMessageManager(FormMessageManager manager){
		this.formMessageManager = manager;
	}


	public FormFieldMessageManager getFormFieldMessageManager(){
		return this.formFieldMessageManager;
	}
	public void setFormFieldMessageManager(FormFieldMessageManager manager){
		this.formFieldMessageManager = manager;
	}


	public FormFieldManager getFormFieldManager(){
		return this.formFieldManager;
	}
	public void setFormFieldManager(FormFieldManager manager){
		this.formFieldManager = manager;
	}


	public FormActionManager getFormActionManager(){
		return this.formActionManager;
	}
	public void setFormActionManager(FormActionManager manager){
		this.formActionManager = manager;
	}


}






