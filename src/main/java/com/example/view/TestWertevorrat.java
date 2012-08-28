package com.example.view;

/**
 * Enum for com.example.view.TestWertevorrat
 */
public enum TestWertevorrat implements TestWertevorratWertevorrat {

    /**
     * WR1
     */
    WR1,
    /**
     * WR2
     */
    WR2;

    private TestWertevorrat() {
    }

    @Override
    public TestWertevorrat getTestWertevorrat() {
        return this;
    }

    @Override
    public String getBezeichnung() {
        return "wertevorrat.testwertevorrat." + this.name();
    }

    @Override
    public String getSchluessel() {
        return name();
    }
}
