package tw.gov.moi.aeweb.showcase.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.ToggleEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
public class demoView {

	private String oldId;
	private String name;
	private Date birthday;
	private String bornway;
	private String city;
	private String type;
	private String addr;
	private String spouse;
	private String father;
	private String mather;
	private String newId;
	private String memo;

	private Date date1;
	private boolean showStep1 = true;
	private boolean showStep2 = false;
	private boolean showStep3 = false;
	private String firstname;
	private String lastname;

	private List<Nationality> nationalitys;
	private LineChartModel lineModel1;

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@PostConstruct
	public void init() {
		createLineModels();
		nationalitys = new ArrayList<Nationality>();
		nationalitys.add(new Nationality("台灣", "Taiwan", 23000000));
		nationalitys.add(new Nationality("中國", "China", 1100000000));
		nationalitys.add(new Nationality("日本", "Japan", 200000000));
		nationalitys.add(new Nationality("美國", "US", 700000000));
		nationalitys.add(new Nationality("法國", "France", 300000000));
	}

	private void createLineModels() {
		final LineChartModel model = new LineChartModel();
		final LineChartSeries series1 = new LineChartSeries();
		series1.setLabel("Series 1");

		series1.set(1, 2);
		series1.set(2, 1);
		series1.set(3, 3);
		series1.set(4, 6);
		series1.set(5, 8);

		final LineChartSeries series2 = new LineChartSeries();
		series2.setLabel("Series 2");

		series2.set(1, 6);
		series2.set(2, 3);
		series2.set(3, 2);
		series2.set(4, 7);
		series2.set(5, 9);

		model.addSeries(series1);
		model.addSeries(series2);

		lineModel1 = model;

		lineModel1.setTitle("Linear Chart");
		lineModel1.setLegendPosition("e");
		final Axis yAxis = lineModel1.getAxis(AxisType.Y);
		yAxis.setMin(0);
		yAxis.setMax(10);
	}

	public void handleStepEvent1() {
		showStep1 = true;
		showStep2 = true;
		showStep3 = false;
	}

	public void handleStepEvent2() {
		showStep1 = true;
		showStep2 = false;
		showStep3 = false;
	}

	public void handleStepEvent3() {
		showStep1 = true;
		showStep2 = true;
		showStep3 = true;
	}

	public void handleStepEvent4() {
		showStep1 = true;
		showStep2 = true;
		showStep3 = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBornway() {
		return bornway;
	}

	public void setBornway(String bornway) {
		this.bornway = bornway;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMather() {
		return mather;
	}

	public void setMather(String mather) {
		this.mather = mather;
	}

	public String getNewId() {
		return newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void handleToggle(ToggleEvent event) {
		final FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled",
				"Visibility:" + event.getVisibility());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getOldId() {
		return oldId;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public boolean isShowStep1() {
		return this.showStep1;
	}

	public void setShowStep1(boolean showStep1) {
		this.showStep1 = showStep1;
	}

	public boolean isShowStep2() {
		return this.showStep2;
	}

	public void setShowStep2(boolean showStep2) {
		this.showStep2 = showStep2;
	}

	public boolean isShowStep3() {
		return this.showStep3;
	}

	public void setShowStep3(boolean showStep3) {
		this.showStep3 = showStep3;
	}

	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + firstname + " " + lastname));
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Nationality> getNationalitys() {
		return this.nationalitys;
	}

	public void setNationalitys(List<Nationality> nationalitys) {
		this.nationalitys = nationalitys;
	}

	public LineChartModel getLineModel1() {
		return this.lineModel1;
	}

	public void setLineModel1(LineChartModel lineModel1) {
		this.lineModel1 = lineModel1;
	}
}