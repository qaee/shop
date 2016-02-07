package de.vf.rest.config;

import javax.ejb.Stateless;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Stateless
@ApplicationPath("rest")
public class RestConfig extends Application {
	
	/*@EJB(beanName="CustomerSurveyLogicInternBean")
	CustomerSurveyLogic customerSurveyLogicIntern;
	
	@EJB(beanName="CustomerSurveyLogicExternBean")
	CustomerSurveyLogic customerSurveyLogicExtern;
	
	@EJB(beanName = "CloseOrderAttributesLogicExternBean")
	private CloseOrderAttributesLogic closeOrderAttributesLogicExtern;
	
	@EJB(beanName = "CloseOrderAttributesLogicInternBean")
	private CloseOrderAttributesLogic closeOrderAttributesLogicIntern;

	@EJB(beanName = "CloseOrderNetworkLogicExternBean")
	private CloseOrderNetworkLogic closeOrderNetworkLogicExtern;
	
	@EJB(beanName = "CloseOrderMeasurementsLogicExternBean")
	private CloseOrderMeasurementsLogic closeOrderMeasurementsLogicExtern;
	
	@EJB(beanName = "CloseOrderMeasurementsLogicInternBean")
	private CloseOrderMeasurementsLogic closeOrderMeasurementsLogicIntern;
	
	@EJB(beanName = "CloseOrderSmbLogicExternBean")
	private CloseOrderSmbLogic closeOrderSmbLogicExtern;
	
	@EJB(beanName = "CloseOrderSmbLogicInternBean")
	private CloseOrderSmbLogic closeOrderSmbLogicIntern;
	
	@EJB
	private CloseOrderEventDataLogic eventDataLogic;

	@EJB(beanName="CloseOrderLogicInternBean")
	private CloseOrderLogic closeOrderlogicIntern;
	
	@EJB(beanName="CloseOrderLogicExternBean")
	private CloseOrderLogic closeOrderlogicExtern;
	
	@EJB(beanName="ActivateOrderLogicExternBean")
	private ActivateOrderLogic activateOrderLogicExtern;

	@EJB(beanName="ActivateOrderLogicInternBean")
	private ActivateOrderLogic activateOrderLogicIntern;
	
	@EJB(beanName = "InterruptOrderLogicInternBean")
    private InterruptOrderLogic interruptOrderLogicIntern;

    @EJB(beanName = "InterruptOrderLogicExternBean")
    private InterruptOrderLogic interruptOrderLogicExtern;
	*/
	
}
