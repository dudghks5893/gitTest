package singleton;

public class Company {
	// �̸� �ν��Ͻ��� �ϳ��� Company ��ü�� ���� static���� ����
	private static Company instance = new Company();
	private Company(){}; //�����ڰ� private�̸� �ٸ� Ŭ�������� �����Ұ�
	
	//�ܺο��� instance ��ü�� �����Ҽ� �ֵ���
	public static Company getInstance() {
		if(instance==null) {//���࿡ ��ü�� ������ �ٽ� ������ش�.
			instance = new Company();
		}
		return instance; //�ϳ����� Company��ü�� ��ȯ�Ѵ�.
	}
}
