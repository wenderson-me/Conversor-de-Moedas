package com.devmaster.conversormoedas;

private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.editDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.editEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

    }

    private static class ViewHolder {
        EditText editValue;
        TextView editDolar;
        TextView editEuro;
        Button buttonCalculate;
    }