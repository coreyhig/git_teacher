 let maxDate = new Date();
 maxDate = maxDate.setMonth(maxDate.getMonth() + 3);
 
 flatpickr('#fromCheckinDate', {
   locale: 'ja',
   minDate: 'today',
   maxDate: maxDate,
   minTime: '09:00',
   maxTime: '18:00',
 });
 
 