/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.rl.common.constant.RlConstant.Operator;
import tw.gov.moi.rl.component.dto.PersonOperationAttribute;

/**
 * The Class PersonOperationCondition.
 * 
 * @author Jay Kan
 */
public class PersonOperationCondition implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8971948130327401816L;

    /** The person operation attributes. */
    private List<PersonOperationAttribute> personOperationAttributes;

    /** The between operator. */
    private String betweenOperator = Operator.AND.name();

    /** The prerelation. */
    private String prerelation = Operator.AND.name();

    /**
     * Gets the person operation attributes.
     * 
     * @return the person operation attributes
     */
    public List<PersonOperationAttribute> getPersonOperationAttributes() {
        return personOperationAttributes;
    }

    /**
     * Sets the person operation attributes.
     * 
     * @param personOperationAttributes
     *            the new person operation attributes
     */
    public void setPersonOperationAttributes(final List<PersonOperationAttribute> personOperationAttributes) {
        this.personOperationAttributes = personOperationAttributes;
    }

    /**
     * Gets the between operator.
     * 
     * @return the between operator
     */
    public String getBetweenOperator() {
        return betweenOperator;
    }

    /**
     * Sets the between operator.
     * 
     * @param betweenOperator
     *            the new between operator
     */
    public void setBetweenOperator(final String betweenOperator) {
        this.betweenOperator = betweenOperator;
    }

    /**
     * Gets the prerelation.
     * 
     * @return the prerelation
     */
    public String getPrerelation() {
        return prerelation;
    }

    /**
     * Sets the prerelation.
     * 
     * @param prerelation
     *            the new prerelation
     */
    public void setPrerelation(final String prerelation) {
        this.prerelation = prerelation;
    }
}
