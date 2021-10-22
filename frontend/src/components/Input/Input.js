import styles from './Input.module.scss';

const Input = ({
  name = 'Email',
  type = 'text',
  placeholder = 'Twój adres email',
}) => {
  return (
    <div className={styles.wrapper}>
      <label htmlFor={name} className="label">
        {name}
      </label>
      <input
        name={name}
        id={name}
        type={type}
        className="input"
        placeholder={placeholder}
      />
    </div>
  );
};

export default Input;
