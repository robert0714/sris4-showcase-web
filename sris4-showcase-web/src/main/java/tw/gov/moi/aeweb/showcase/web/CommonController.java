package tw.gov.moi.aeweb.showcase.web;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.iisigroup.udeweb.jsf.UDEWebController;
import com.iisigroup.udeweb.jsf.springbridge.SpringBridge;

import tw.gov.moi.ae.AECDMesg;
import tw.gov.moi.aeweb.BaseRisController;
import tw.gov.moi.aeweb.exception.RisWebException;
import tw.gov.moi.aeweb.showcase.common.H2DataSourceTools;
import tw.gov.moi.aeweb.showcase.common.TestingDTO;

@Named("commonController")
@WindowScoped
@SpringBridge
@UDEWebController
public class CommonController extends BaseRisController {

    //================================================
    //== [Enumeration types] Block Start
    //== [Enumeration types] Block End
    //================================================
    //== [static variables] Block Start
    private static final long serialVersionUID = 1L;

    /** Logger Object. */
    @SuppressWarnings("unused")
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(CommonController.class);

    //== [static variables] Block Stop
    //================================================
    //== [instance variables] Block Start.

    private TestingDTO sample;

    private StreamedContent file;

    //== [instance variables] Block Stop
    //================================================
    //== [static Constructor] Block Start
    //== [static Constructor] Block Stop
    //================================================
    //== [Constructors] Block Start (含init method)

    @PostConstruct
    public void init() {
        this.sample = new TestingDTO();
        InputStream stream = this.getClass().getResourceAsStream("yourfile.pdf");
        this.file = new DefaultStreamedContent(stream, "application/pdf", "downloaded_file.pdf");
    }

    //== [Constructors] Block Stop
    //================================================
    //== [Static Method] Block Start
    //== [Static Method] Block Stop
    //================================================
    //== [Accessor] Block Start

    public TestingDTO getSample() {
        return this.sample;
    }

    //== [Accessor] Block Stop
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //== [Overrided Method] Block Stop
    //================================================
    //== [Method] Block Start
    //####################################################################
    //## [Method] sub-block :
    //####################################################################

    public void doQuery() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        this.risFacesTool.addMessage(AECDMesg.AE0001S);
    }

    public void doQueryWithException() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        throw RisWebException.create(AECDMesg.AE9999E);
    }

    public String doQueryPage() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        final String viewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        final String returnPage = StringUtils.substringAfterLast(viewId, "/");

        this.risFacesTool.addMessage(AECDMesg.AE0001S);
        LOGGER.debug("returnPage : {}", returnPage);
        return returnPage;
    }

    public String doQueryPageWithException() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        throw RisWebException.create(AECDMesg.AE9999E);
    }
    
    

    //== [Method] Block Stop
    //================================================
    //== [Inner Class] Block Start
    //== [Inner Class] Block Stop
    //================================================
    public void doTest(){
    	System.out.println("TEST~~~~~~~~~~~~~~~~~~~~~~~~");
    	Connection conn= H2DataSourceTools.getH2Connection();
    	try {
			DatabaseMetaData dbMeta= conn.getMetaData();
			System.out.println("this db name is "+ dbMeta.getDatabaseProductName());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
