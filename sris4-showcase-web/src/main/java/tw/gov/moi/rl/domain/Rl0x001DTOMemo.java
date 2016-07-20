package tw.gov.moi.rl.domain;

import org.apache.commons.beanutils.BeanUtils;

public class Rl0x001DTOMemo {
    private String name;

    private Object source;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public void setMemo(Rl0x001DTOMemo memo) {
        try {
            this.name = memo.getName();
            this.source = BeanUtils.cloneBean(memo.getSource());
        } catch (Exception e) {

        }

    }
}
