document.addEventListener("DOMContentLoaded", function() {
    let selectorOptions = {
        buttons: [{
            step: 'day',
            stepmode: 'backward',
            count: 1,
            label: 'день'
        }, {
            step: 'month',
            stepmode: 'backward',
            count: 1,
            label: 'месяц'
        }, {
            step: 'month',
            stepmode: 'backward',
            count: 6,
            label: '6 месяцев'
        }, {
            step: 'year',
            stepmode: 'todate',
            count: 1,
            label: 'текущий год'
        }, {
            step: 'year',
            stepmode: 'backward',
            count: 1,
            label: 'год'
        }, {
            step: 'all',
            label: 'все время'
        }],
    };

    let layout = {
            xaxis: {
                rangeselector: selectorOptions,
                rangeslider: {}
            },
            yaxis: {
                fixedrange: true
            }
        };

    let dates = []
    for (let i = 0; i < plot_data_dates.length; i++) {
        let string_date = plot_data_dates[i];
        let new_string_date = string_date.slice(5, 7) + "/" +
            string_date.slice(8, 10) + "/" +
            string_date.slice(0, 4) + " " +
            string_date.slice(11, 16);
        dates[i] = new Date(
            new_string_date
        );
    }

    let data = [
        {
            mode: 'lines',
            name: 'Верхнее давление',
            x: dates,
               
            y: plot_data_top
        },
        {
            mode: 'lines',
            name: 'Нижнее давление',
            x: dates,

            y: plot_data_bottom
        }
    ];

    Plotly.plot('graph', data, layout, {showSendToCloud: false});
});