import React, { useEffect, useState } from 'react';
import styles from './index.module.scss';
const DatePicker = ({ datePickerYear, datePickerMonth, isDateClicked }) => {
  const [selectedYear, setSelectedYear] = useState([]);
  const [selectedMonths, setSelectedMonths] = useState([]);

  const years = ['2021', '2022'];

  const months = [
    'Lipiec',
    'Sierpień',
    'Wrzesień',
    'Październik',
    'Listopad',
    'Grudzień',
  ];

  const onClickYear = (value) => {
    if (selectedYear.includes(value)) {
      const index = selectedYear.indexOf(value);
      setSelectedYear(selectedYear.filter((el, idx) => idx !== index));
    } else {
      setSelectedYear([...selectedYear, value]);
    }
  };
  const onClickMonth = (value) => {
    if (selectedMonths.includes(value)) {
      const index = selectedMonths.indexOf(value);
      setSelectedMonths(selectedMonths.filter((el, idx) => idx !== index));
    } else {
      setSelectedMonths([...selectedMonths, value]);
    }
  };

  useEffect(() => {
    datePickerYear(selectedYear);
  }, [selectedYear]);

  useEffect(() => {
    datePickerMonth(selectedMonths);
  }, [selectedMonths]);

  return (
    <div
      className={styles.wrapper}
      style={{ display: `${isDateClicked ? '' : 'none'} ` }}
    >
      <ul className={styles.years}>
        {years.map((year, index) => (
          <li
            key={index}
            onClick={() => onClickYear(year)}
            style={{
              backgroundColor: `${
                selectedYear.includes(year) ? '#FFC590' : ''
              }`,
              color: `${selectedYear.includes(year) ? '#FFFCF7' : ''}`,
            }}
          >
            {year}
          </li>
        ))}
      </ul>
      <ul className={styles.months}>
        {months.map((month, index) => (
          <li
            key={index}
            onClick={() => onClickMonth(month)}
            style={{
              backgroundColor: `${
                selectedMonths.includes(month) ? 'rgba(255, 197, 144, 0.1)' : ''
              }`,
              border: `${
                selectedMonths.includes(month) ? '1px solid #FFC590' : ''
              }`,
            }}
          >
            {month}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default DatePicker;
