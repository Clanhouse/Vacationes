import styles from './index.module.scss';

const Text = ({ children }) => {
  return <span className={styles.text}>{children}</span>;
};

export default Text;
