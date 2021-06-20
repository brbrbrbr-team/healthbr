$( document ).ready(function() {
    function timestampToDatetimeInputString(timestamp) {
        const date = new Date(timestamp + new Date().getTimezoneOffset() * -60 * 1000);
        return date.toISOString().slice(0, 16);
    }

    $(".snils-mask").inputmask({"mask": "999-999-999 99"});
    $("#inputDatetime").val(timestampToDatetimeInputString(Date.now()));
});