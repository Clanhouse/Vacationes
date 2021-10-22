import styles from './Text.module.scss';

const Text = ({ big, bold, children }) => {
  return (
    <span
      className={`${styles.text} ${big ? styles.big : ''} ${
        bold ? styles.bold : ''
      }`}
    >
      {children}
    </span>
  );
};

export default Text;
